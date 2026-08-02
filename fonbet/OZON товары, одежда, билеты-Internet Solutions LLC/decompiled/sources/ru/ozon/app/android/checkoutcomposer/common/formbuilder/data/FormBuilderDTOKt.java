package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

import WZ.t;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.data.deprecated.Checkbox;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.ViewType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\u0004\u0018\u00010\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a\u0013\u0010\b\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\b\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\b\u0010\u0017\u001a\u0013\u0010\b\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\b\u0010\u001a\u001a\u0013\u0010\b\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\b\u0010\u001d\u001a\u0013\u0010\b\u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b\b\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "bottomSeparator", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;LWZ/t;Z)Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;", "", "maxFieldSize", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;ILWZ/t;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "toYandexVO", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderDTOKt {
    @NotNull
    public static final List<FormBuilderBlockVO> toVO(@NotNull FormBuilderDTO formBuilderDTO, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(formBuilderDTO, "<this>");
        List<FormBuilderDTO.Row> rows = formBuilderDTO.getRows();
        ArrayList arrayList = new ArrayList();
        for (FormBuilderDTO.Row row : rows) {
            int size = row.getBlocks().size() - 1;
            List<FormBuilderDTO.Row.Block> blocks = row.getBlocks();
            ArrayList arrayList2 = new ArrayList(C7714v.z(blocks, 10));
            int i11 = 0;
            for (Object obj : blocks) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                FormBuilderDTO.Row.Block block = (FormBuilderDTO.Row.Block) obj;
                List<AtomDTO> elements = block.getElements();
                List<AtomDTO> list = (elements == null || elements.isEmpty()) ? null : elements;
                Integer blockSize = block.getBlockSize();
                int rowSize = formBuilderDTO.getRowSize();
                List<FormBuilderDTO.Row.Block.BlockRow> rows2 = block.getRows();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = rows2.iterator();
                while (it.hasNext()) {
                    List<FormBuilderDTO.Row.Block.BlockRow.Field> fields = ((FormBuilderDTO.Row.Block.BlockRow) it.next()).getFields();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it2 = fields.iterator();
                    while (it2.hasNext()) {
                        FormBuilderBlockVO.Field vo = toVO((FormBuilderDTO.Row.Block.BlockRow.Field) it2.next(), formBuilderDTO.getRowSize(), tVar);
                        if (vo != null) {
                            arrayList4.add(vo);
                        }
                    }
                    C7714v.p(arrayList4, arrayList3);
                }
                arrayList2.add(new FormBuilderBlockVO(list, blockSize, rowSize, arrayList3, z11 && i11 == size));
                i11 = i12;
            }
            C7714v.p(arrayList2, arrayList);
        }
        return arrayList;
    }

    public static /* synthetic */ List toVO$default(FormBuilderDTO formBuilderDTO, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return toVO(formBuilderDTO, tVar, z11);
    }

    private static final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions toYandexVO(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions searchOptions) {
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States.StubState unavailableAddress;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States.StubState initial;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States.StubState empty;
        String link = searchOptions.getLink();
        String title = searchOptions.getTitle();
        int threshold = searchOptions.getThreshold();
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox boundingBox = searchOptions.getBoundingBox();
        List<AtomDTO> list = null;
        FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox vo = boundingBox != null ? toVO(boundingBox) : null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States states = searchOptions.getStates();
        List<AtomDTO> annotations = (states == null || (empty = states.getEmpty()) == null) ? null : empty.getAnnotations();
        if (annotations == null) {
            annotations = K.f71697a;
        }
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States states2 = searchOptions.getStates();
        List<AtomDTO> annotations2 = (states2 == null || (initial = states2.getInitial()) == null) ? null : initial.getAnnotations();
        if (annotations2 == null) {
            annotations2 = K.f71697a;
        }
        List<AtomDTO> list2 = annotations2;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States states3 = searchOptions.getStates();
        if (states3 != null && (unavailableAddress = states3.getUnavailableAddress()) != null) {
            list = unavailableAddress.getAnnotations();
        }
        if (list == null) {
            list = K.f71697a;
        }
        return new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions(link, title, threshold, vo, annotations, list, list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final FormBuilderBlockVO.Field toVO(FormBuilderDTO.Row.Block.BlockRow.Field field, int i11, t tVar) {
        List<AtomDTO> elements;
        InputAtom.Configuration.InputType inputType;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions searchOptions;
        FormBuilderBlockVO.Field.YandexSearchField.SearchOptions yandexVO;
        AtomActionDTO action;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions searchOptions2;
        FormBuilderBlockVO.Field.SearchField.SearchOptions vo;
        OzonSpannableString ozonSpannableString;
        OzonSpannableString orEmpty;
        List<FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option> options;
        Object obj;
        String fieldType = field.getFieldType();
        r7 = null;
        AtomAction atomAction = null;
        switch (fieldType.hashCode()) {
            case -2028776943:
                if (fieldType.equals("FIELD_TYPE_ATOM") && (elements = field.getElements()) != null) {
                    if (elements.isEmpty()) {
                        elements = null;
                    }
                    if (elements != null) {
                        return new FormBuilderBlockVO.Field.AtomField(field.getName(), ViewType.ATOMS, Math.min(field.getFieldSize(), i11), field.isEnabled(), field.getElements());
                    }
                }
                return null;
            case -2028225043:
                if (fieldType.equals("FIELD_TYPE_TEXT")) {
                    String name = field.getName();
                    int min = Math.min(field.getFieldSize(), i11);
                    boolean isEnabled = field.isEnabled();
                    ViewType viewType = ViewType.TEXT;
                    String label = field.getLabel();
                    String text = field.getText();
                    String str = text == null ? "" : text;
                    String error = field.getError();
                    FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions = field.getTextOptions();
                    if (Intrinsics.d(textOptions != null ? textOptions.getInputType() : null, "phone")) {
                        inputType = InputAtom.Configuration.InputType.PHONE;
                    } else {
                        FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions2 = field.getTextOptions();
                        if (textOptions2 == null || !textOptions2.isMultiline()) {
                            FormBuilderDTO.Row.Block.BlockRow.Field.TextOptions textOptions3 = field.getTextOptions();
                            inputType = Intrinsics.d(textOptions3 != null ? textOptions3.getInputType() : null, "default") ? InputAtom.Configuration.InputType.TEXT : InputAtom.Configuration.InputType.TEXT;
                        } else {
                            inputType = InputAtom.Configuration.InputType.TEXT_MULTILINE;
                        }
                    }
                    return new FormBuilderBlockVO.Field.TextField(name, viewType, min, isEnabled, label, str, error, inputType);
                }
                return null;
            case -1920521085:
                if (fieldType.equals("FIELD_TYPE_CHECKBOX")) {
                    String name2 = field.getName();
                    ViewType viewType2 = ViewType.CHECKBOX;
                    int min2 = Math.min(field.getFieldSize(), i11);
                    boolean isEnabled2 = field.isEnabled();
                    OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(field.getLabel());
                    Integer w02 = h.w0(field.getValue());
                    return new FormBuilderBlockVO.Field.CheckboxField(name2, viewType2, min2, isEnabled2, new Checkbox(ozonSpannableString2, null, w02 != null && w02.intValue() == 1, null, null, null, null, null, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, null), field.getError());
                }
                return null;
            case -1301671512:
                if (!fieldType.equals("FIELD_TYPE_SEARCH_YANDEX") || (searchOptions = field.getSearchOptions()) == null || (yandexVO = toYandexVO(searchOptions)) == null) {
                    return null;
                }
                String name3 = field.getName();
                ViewType viewType3 = ViewType.YANDEX_SEARCH;
                int min3 = Math.min(field.getFieldSize(), i11);
                boolean isEnabled3 = field.isEnabled();
                String label2 = field.getLabel();
                String text2 = field.getText();
                return new FormBuilderBlockVO.Field.YandexSearchField(name3, viewType3, min3, isEnabled3, label2, OzonSpannableStringKt.orEmpty(text2 != null ? OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, text2, 0, 2, null) : null), field.getValue(), field.getError(), yandexVO, tVar);
            case 121198233:
                if (fieldType.equals("FIELD_TYPE_CHIPS_WITH_FIELD")) {
                    String name4 = field.getName();
                    ViewType viewType4 = ViewType.FIELD_TYPE_CHIPS_WITH_FIELD;
                    int min4 = Math.min(field.getFieldSize(), i11);
                    boolean isEnabled4 = field.isEnabled();
                    FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField chipsWithField = field.getChipsWithField();
                    return new FormBuilderBlockVO.Field.ChipsField(name4, viewType4, min4, isEnabled4, chipsWithField != null ? toVO(chipsWithField) : null, field.getOnboarding());
                }
                return null;
            case 244957942:
                if (fieldType.equals("FIELD_TYPE_ACTION")) {
                    String name5 = field.getName();
                    ViewType viewType5 = ViewType.ACTION;
                    int min5 = Math.min(field.getFieldSize(), i11);
                    boolean isEnabled5 = field.isEnabled();
                    String label3 = field.getLabel();
                    String text3 = field.getText();
                    String str2 = text3 == null ? "" : text3;
                    String value = field.getValue();
                    String error2 = field.getError();
                    FormBuilderDTO.Row.Block.BlockRow.Field.ActionOptions actionOptions = field.getActionOptions();
                    if (actionOptions != null && (action = actionOptions.getAction()) != null) {
                        atomAction = AtomActionMapperKt.toAtomAction(action, null);
                    }
                    return new FormBuilderBlockVO.Field.ActionField(name5, viewType5, min5, isEnabled5, label3, str2, value, error2, atomAction);
                }
                return null;
            case 761571944:
                if (!fieldType.equals("FIELD_TYPE_SEARCH") || (searchOptions2 = field.getSearchOptions()) == null || (vo = toVO(searchOptions2)) == null) {
                    return null;
                }
                String name6 = field.getName();
                ViewType viewType6 = ViewType.SEARCH;
                int min6 = Math.min(field.getFieldSize(), i11);
                boolean isEnabled6 = field.isEnabled();
                String label4 = field.getLabel();
                String text4 = field.getText();
                return new FormBuilderBlockVO.Field.SearchField(name6, viewType6, min6, isEnabled6, label4, OzonSpannableStringKt.orEmpty(text4 != null ? OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, text4, 0, 2, null) : null), field.getValue(), field.getError(), vo);
            case 761887164:
                if (fieldType.equals("FIELD_TYPE_SELECT")) {
                    String name7 = field.getName();
                    ViewType viewType7 = ViewType.SELECTOR;
                    int min7 = Math.min(field.getFieldSize(), i11);
                    boolean isEnabled7 = field.isEnabled();
                    String label5 = field.getLabel();
                    String text5 = field.getText();
                    if (text5 == null || (orEmpty = OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, text5, 0, 2, null)) == null) {
                        FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions selectOptions = field.getSelectOptions();
                        if (selectOptions != null && (options = selectOptions.getOptions()) != null) {
                            Iterator<T> it = options.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (Intrinsics.d(((FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option) obj).getValue(), field.getValue())) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option option = (FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option) obj;
                            if (option != null) {
                                ozonSpannableString = option.getText();
                                orEmpty = OzonSpannableStringKt.orEmpty(ozonSpannableString);
                            }
                        }
                        ozonSpannableString = null;
                        orEmpty = OzonSpannableStringKt.orEmpty(ozonSpannableString);
                    }
                    OzonSpannableString ozonSpannableString3 = orEmpty;
                    String value2 = field.getValue();
                    String error3 = field.getError();
                    FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions selectOptions2 = field.getSelectOptions();
                    return new FormBuilderBlockVO.Field.SelectorField(name7, viewType7, min7, isEnabled7, label5, ozonSpannableString3, value2, error3, selectOptions2 != null ? toVO(selectOptions2) : null);
                }
                return null;
            default:
                return null;
        }
    }

    private static final FormBuilderBlockVO.Field.SearchField.SearchOptions toVO(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions searchOptions) {
        return new FormBuilderBlockVO.Field.SearchField.SearchOptions(searchOptions.getLink(), searchOptions.getThreshold());
    }

    private static final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox toVO(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox boundingBox) {
        return new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox(toVO(boundingBox.getRightTop()), toVO(boundingBox.getLeftBottom()));
    }

    private static final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate toVO(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.GeoCoordinate geoCoordinate) {
        return new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate(geoCoordinate.getLatitude(), geoCoordinate.getLongitude());
    }

    private static final FormBuilderBlockVO.Field.SelectorField.SelectOptions toVO(FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions selectOptions) {
        String title = selectOptions.getTitle();
        List<FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option> options = selectOptions.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        for (FormBuilderDTO.Row.Block.BlockRow.Field.SelectOptions.Option option : options) {
            arrayList.add(new FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option(option.getValue(), option.getText(), option.getDeepLink(), option.getSubText(), option.getSubTextColor()));
        }
        return new FormBuilderBlockVO.Field.SelectorField.SelectOptions(title, arrayList);
    }

    private static final FormBuilderBlockVO.Field.ChipsField.ChipsWithField toVO(FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField chipsWithField) {
        ArrayList arrayList;
        List<FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.ChipItemMobile> chipsMobile = chipsWithField.getChipsMobile();
        if (chipsMobile != null) {
            List<FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.ChipItemMobile> list = chipsMobile;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.ChipItemMobile chipItemMobile : list) {
                Boolean hasTextField = chipItemMobile.getHasTextField();
                arrayList2.add(new FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile(hasTextField != null ? hasTextField.booleanValue() : false, chipItemMobile.getTagButton()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.TextField textField = chipsWithField.getTextField();
        String value = textField != null ? textField.getValue() : null;
        FormBuilderDTO.Row.Block.BlockRow.Field.ChipsWithField.TextField textField2 = chipsWithField.getTextField();
        return new FormBuilderBlockVO.Field.ChipsField.ChipsWithField(arrayList, new FormBuilderBlockVO.Field.ChipsField.ChipsWithField.TextField(value, textField2 != null ? textField2.getPlaceholder() : null), false, 4, null);
    }
}
