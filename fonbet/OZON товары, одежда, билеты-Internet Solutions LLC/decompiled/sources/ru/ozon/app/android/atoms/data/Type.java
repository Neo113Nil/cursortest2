package ru.ozon.app.android.atoms.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.courieronmap.data.CourierOnMapDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bV\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bY¨\u0006Z"}, d2 = {"Lru/ozon/app/android/atoms/data/Type;", "Lru/ozon/app/android/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", CommentV3DTO.HEADER_NAME, "TEXT_ATOM_WITH_ICON", "TEXT_SMALL", "TEXT_MEDIUM", "TEXT_FOOTER", "TEXT_SUBTEXT", "CHECKBOX", "CHECKBOXES", "BULLET_ELEMENTS", "BUTTON", "BUTTON_SMALL", "BUTTON_SECONDARY", "BUTTON_SECONDARY_SMALL", "BUTTON_BORDERLESS", "BUTTON_BORDERLESS_SMALL", "INPUT", "VERTICAL_CONTAINER", "HORIZONTAL_CONTAINER", "RADIO_ITEM", "PAYMENT_METHOD", "PRICE_WITH_TITLE", "PROGRESS_BAR", "STOCK_BAR", "IMAGE_CAROUSEL", "CELL_DEFAULT", "CELL_TOGGLE", "CELL_RADIO", "CELL_RADIO_GROUP", "LABELS", "LABEL", "VARIANTS_TEXT", "VARIANTS_COLOR", "RATING_VERTICAL", "RATING_BADGE", "COLOR_VARIANTS", "TEXT_VARIANTS", "LIST_ELEMENT_ICON_TEXT_MEDIUM", "LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM", "LIST_ELEMENT_NUMBERED", "LIST_ELEMENT_TABLE_ROW", "LIST_ELEMENT_BULLET", "LIST_ELEMENT", "BULLET_LIST", "NUMBERED_LIST", "CELL_REGULAR_24ICON_PICKER", "CELL_REGULAR_PICKER", "CELL_WITH_SUBTITLE_48ICON", "CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO", "CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO", "CELL_WITH_SUBTITLE_32ICON", "CELL_WITH_SUBTITLE_40ICON", "CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO", "CELL_WITH_SUBTITLE_24ICON", "CELL_WITH_SUBTITLE_24ICON_PICKER", "CELL_WITH_SUBTITLE_COUNTER", "CELL_WITH_REVERSE_SUBTITLE_COUNTER", "CELL_WITH_SUBTITLE_VALUE", "CELL_WITH_SUBTITLE_TOGGLE", "CELL_WITH_SUBTITLE_CHECKBOX_RADIO", "CELL_WITH_SUBTITLE_DEFAULT", "CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER", "CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER", "CELL_WITH_SUBTITLE_24ICON_COUNTER", "CELL_WITH_SUBTITLE_TOGGLE_COUNTER", "CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER", "MULTILINE_BADGE", "GRADIENT_BADGE", "TIMER_BADGE", "DISCLAIMER", "GALLERY", "SELECT", "RANGE_FILTER", "TIME_RANGE_FILTER", "OPEN_RANGE_FILTER", "AUTHOR_BLOCK", "SWITCHING_BUTTON", "COLOR", "TABS", "GRADIENT", "DISCLOSURE", "LABEL_LIST", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Type implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;

    @NotNull
    private final String value;

    @i(name = CommentV3DTO.HEADER_FIELD_NAME)
    public static final Type HEADER = new Type(CommentV3DTO.HEADER_NAME, 0, CommentV3DTO.HEADER_FIELD_NAME);

    @i(name = "textAtomWithIcon")
    public static final Type TEXT_ATOM_WITH_ICON = new Type("TEXT_ATOM_WITH_ICON", 1, "textAtomWithIcon");

    @i(name = "textSmall")
    public static final Type TEXT_SMALL = new Type("TEXT_SMALL", 2, "textSmall");

    @i(name = "textMedium")
    public static final Type TEXT_MEDIUM = new Type("TEXT_MEDIUM", 3, "textMedium");

    @i(name = "textFooter")
    public static final Type TEXT_FOOTER = new Type("TEXT_FOOTER", 4, "textFooter");

    @i(name = "textSubtext")
    public static final Type TEXT_SUBTEXT = new Type("TEXT_SUBTEXT", 5, "textSubtext");

    @i(name = "checkbox")
    public static final Type CHECKBOX = new Type("CHECKBOX", 6, "checkbox");

    @i(name = "checkboxes")
    public static final Type CHECKBOXES = new Type("CHECKBOXES", 7, "checkboxes");

    @i(name = "bulletElements")
    public static final Type BULLET_ELEMENTS = new Type("BULLET_ELEMENTS", 8, "bulletElements");

    @InterfaceC3999a
    @i(name = "button")
    public static final Type BUTTON = new Type("BUTTON", 9, "button");

    @InterfaceC3999a
    @i(name = "buttonSmall")
    public static final Type BUTTON_SMALL = new Type("BUTTON_SMALL", 10, "buttonSmall");

    @InterfaceC3999a
    @i(name = "buttonSecondary")
    public static final Type BUTTON_SECONDARY = new Type("BUTTON_SECONDARY", 11, "buttonSecondary");

    @InterfaceC3999a
    @i(name = "buttonSecondarySmall")
    public static final Type BUTTON_SECONDARY_SMALL = new Type("BUTTON_SECONDARY_SMALL", 12, "buttonSecondarySmall");

    @InterfaceC3999a
    @i(name = "borderlessButton")
    public static final Type BUTTON_BORDERLESS = new Type("BUTTON_BORDERLESS", 13, "borderlessButton");

    @InterfaceC3999a
    @i(name = "borderlessButtonSmall")
    public static final Type BUTTON_BORDERLESS_SMALL = new Type("BUTTON_BORDERLESS_SMALL", 14, "borderlessButtonSmall");

    @i(name = "input")
    public static final Type INPUT = new Type("INPUT", 15, "input");

    @i(name = "verticalContainer")
    public static final Type VERTICAL_CONTAINER = new Type("VERTICAL_CONTAINER", 16, "verticalContainer");

    @i(name = "horizontalContainer")
    public static final Type HORIZONTAL_CONTAINER = new Type("HORIZONTAL_CONTAINER", 17, "horizontalContainer");

    @i(name = "radioItem")
    public static final Type RADIO_ITEM = new Type("RADIO_ITEM", 18, "radioItem");

    @i(name = "paymentMethod")
    public static final Type PAYMENT_METHOD = new Type("PAYMENT_METHOD", 19, "paymentMethod");

    @i(name = DynamicElementDTO.PRICE_WITH_TITLE)
    public static final Type PRICE_WITH_TITLE = new Type("PRICE_WITH_TITLE", 20, DynamicElementDTO.PRICE_WITH_TITLE);

    @i(name = "progressBar")
    public static final Type PROGRESS_BAR = new Type("PROGRESS_BAR", 21, "progressBar");

    @i(name = "stockBar")
    public static final Type STOCK_BAR = new Type("STOCK_BAR", 22, "stockBar");

    @i(name = "imageCarousel")
    public static final Type IMAGE_CAROUSEL = new Type("IMAGE_CAROUSEL", 23, "imageCarousel");

    @i(name = "defaultCell")
    public static final Type CELL_DEFAULT = new Type("CELL_DEFAULT", 24, "defaultCell");

    @i(name = "toggleCell")
    public static final Type CELL_TOGGLE = new Type("CELL_TOGGLE", 25, "toggleCell");

    @i(name = "radioCell")
    public static final Type CELL_RADIO = new Type("CELL_RADIO", 26, "radioCell");

    @i(name = "radioElements")
    public static final Type CELL_RADIO_GROUP = new Type("CELL_RADIO_GROUP", 27, "radioElements");

    @i(name = "labels")
    public static final Type LABELS = new Type("LABELS", 28, "labels");

    @i(name = "label")
    public static final Type LABEL = new Type("LABEL", 29, "label");

    @i(name = "variantsText")
    public static final Type VARIANTS_TEXT = new Type("VARIANTS_TEXT", 30, "variantsText");

    @i(name = "variantsColor")
    public static final Type VARIANTS_COLOR = new Type("VARIANTS_COLOR", 31, "variantsColor");

    @i(name = "ratingVertical")
    public static final Type RATING_VERTICAL = new Type("RATING_VERTICAL", 32, "ratingVertical");

    @i(name = "ratingBadge")
    public static final Type RATING_BADGE = new Type("RATING_BADGE", 33, "ratingBadge");

    @i(name = "colorVariants")
    public static final Type COLOR_VARIANTS = new Type("COLOR_VARIANTS", 34, "colorVariants");

    @i(name = "textVariants")
    public static final Type TEXT_VARIANTS = new Type("TEXT_VARIANTS", 35, "textVariants");

    @i(name = "iconTextMediumListElement")
    public static final Type LIST_ELEMENT_ICON_TEXT_MEDIUM = new Type("LIST_ELEMENT_ICON_TEXT_MEDIUM", 36, "iconTextMediumListElement");

    @i(name = "iconWithTitleMediumListElement")
    public static final Type LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM = new Type("LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM", 37, "iconWithTitleMediumListElement");

    @i(name = "numberedListElement")
    public static final Type LIST_ELEMENT_NUMBERED = new Type("LIST_ELEMENT_NUMBERED", 38, "numberedListElement");

    @i(name = "tableRowListElement")
    public static final Type LIST_ELEMENT_TABLE_ROW = new Type("LIST_ELEMENT_TABLE_ROW", 39, "tableRowListElement");

    @i(name = "bulletListElement")
    public static final Type LIST_ELEMENT_BULLET = new Type("LIST_ELEMENT_BULLET", 40, "bulletListElement");

    @i(name = "listElement")
    public static final Type LIST_ELEMENT = new Type("LIST_ELEMENT", 41, "listElement");

    @i(name = "bulletList")
    public static final Type BULLET_LIST = new Type("BULLET_LIST", 42, "bulletList");

    @i(name = "numberedList")
    public static final Type NUMBERED_LIST = new Type("NUMBERED_LIST", 43, "numberedList");

    @i(name = "cellRegular24IconPicker")
    public static final Type CELL_REGULAR_24ICON_PICKER = new Type("CELL_REGULAR_24ICON_PICKER", 44, "cellRegular24IconPicker");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_REGULAR_PICKER)
    public static final Type CELL_REGULAR_PICKER = new Type("CELL_REGULAR_PICKER", 45, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_REGULAR_PICKER);

    @i(name = "cellWithSubtitle48Icon")
    public static final Type CELL_WITH_SUBTITLE_48ICON = new Type("CELL_WITH_SUBTITLE_48ICON", 46, "cellWithSubtitle48Icon");

    @i(name = "cellWithSubtitle48IconCheckboxRadio")
    public static final Type CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO = new Type("CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO", 47, "cellWithSubtitle48IconCheckboxRadio");

    @i(name = "cellWithSubtitle40IconCheckboxRadio")
    public static final Type CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO = new Type("CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO", 48, "cellWithSubtitle40IconCheckboxRadio");

    @i(name = "cellWithSubtitle32Icon")
    public static final Type CELL_WITH_SUBTITLE_32ICON = new Type("CELL_WITH_SUBTITLE_32ICON", 49, "cellWithSubtitle32Icon");

    @i(name = "cellWithSubtitle40Icon")
    public static final Type CELL_WITH_SUBTITLE_40ICON = new Type("CELL_WITH_SUBTITLE_40ICON", 50, "cellWithSubtitle40Icon");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_CHECKBOX_RADIO)
    public static final Type CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO = new Type("CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO", 51, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_CHECKBOX_RADIO);

    @i(name = "cellWithSubtitle24Icon")
    public static final Type CELL_WITH_SUBTITLE_24ICON = new Type("CELL_WITH_SUBTITLE_24ICON", 52, "cellWithSubtitle24Icon");

    @i(name = CourierOnMapDTO.Cell.WITH_SUBTITLE_ICON_PICKER)
    public static final Type CELL_WITH_SUBTITLE_24ICON_PICKER = new Type("CELL_WITH_SUBTITLE_24ICON_PICKER", 53, CourierOnMapDTO.Cell.WITH_SUBTITLE_ICON_PICKER);

    @i(name = "cellWithSubtitleCounter")
    public static final Type CELL_WITH_SUBTITLE_COUNTER = new Type("CELL_WITH_SUBTITLE_COUNTER", 54, "cellWithSubtitleCounter");

    @i(name = "cellWithReverseSubtitleCounter")
    public static final Type CELL_WITH_REVERSE_SUBTITLE_COUNTER = new Type("CELL_WITH_REVERSE_SUBTITLE_COUNTER", 55, "cellWithReverseSubtitleCounter");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_VALUE)
    public static final Type CELL_WITH_SUBTITLE_VALUE = new Type("CELL_WITH_SUBTITLE_VALUE", 56, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_VALUE);

    @i(name = "cellWithSubtitleToggle")
    public static final Type CELL_WITH_SUBTITLE_TOGGLE = new Type("CELL_WITH_SUBTITLE_TOGGLE", 57, "cellWithSubtitleToggle");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_CHECKBOX_RADIO)
    public static final Type CELL_WITH_SUBTITLE_CHECKBOX_RADIO = new Type("CELL_WITH_SUBTITLE_CHECKBOX_RADIO", 58, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_CHECKBOX_RADIO);

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_DEFAULT)
    public static final Type CELL_WITH_SUBTITLE_DEFAULT = new Type("CELL_WITH_SUBTITLE_DEFAULT", 59, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_DEFAULT);

    @i(name = "cellWithSubtitleCheckboxRadioCounter")
    public static final Type CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER = new Type("CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER", 60, "cellWithSubtitleCheckboxRadioCounter");

    @i(name = "cellWithSubtitle24IconCheckboxRadioCounter")
    public static final Type CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER = new Type("CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER", 61, "cellWithSubtitle24IconCheckboxRadioCounter");

    @i(name = "cellWithSubtitle24IconCounter")
    public static final Type CELL_WITH_SUBTITLE_24ICON_COUNTER = new Type("CELL_WITH_SUBTITLE_24ICON_COUNTER", 62, "cellWithSubtitle24IconCounter");

    @i(name = "cellWithSubtitleToggleCounter")
    public static final Type CELL_WITH_SUBTITLE_TOGGLE_COUNTER = new Type("CELL_WITH_SUBTITLE_TOGGLE_COUNTER", 63, "cellWithSubtitleToggleCounter");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_TOGGLE_COUNTER)
    public static final Type CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER = new Type("CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER", 64, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_TOGGLE_COUNTER);

    @i(name = DynamicElementDTO.MULTILINE_BADGE)
    public static final Type MULTILINE_BADGE = new Type("MULTILINE_BADGE", 65, DynamicElementDTO.MULTILINE_BADGE);

    @i(name = "gradientBadge")
    public static final Type GRADIENT_BADGE = new Type("GRADIENT_BADGE", 66, "gradientBadge");

    @i(name = "timerBadge")
    public static final Type TIMER_BADGE = new Type("TIMER_BADGE", 67, "timerBadge");

    @i(name = SelectionItemFormDTO.DISCLAIMER_FIELD_NAME)
    public static final Type DISCLAIMER = new Type("DISCLAIMER", 68, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);

    @i(name = "gallery")
    public static final Type GALLERY = new Type("GALLERY", 69, "gallery");

    @i(name = "select")
    public static final Type SELECT = new Type("SELECT", 70, "select");

    @i(name = "rangeFilter")
    public static final Type RANGE_FILTER = new Type("RANGE_FILTER", 71, "rangeFilter");

    @i(name = "timeRangeFilter")
    public static final Type TIME_RANGE_FILTER = new Type("TIME_RANGE_FILTER", 72, "timeRangeFilter");

    @i(name = "openRangeFilter")
    public static final Type OPEN_RANGE_FILTER = new Type("OPEN_RANGE_FILTER", 73, "openRangeFilter");

    @i(name = "authorBlock")
    public static final Type AUTHOR_BLOCK = new Type("AUTHOR_BLOCK", 74, "authorBlock");

    @i(name = "switchingButton")
    public static final Type SWITCHING_BUTTON = new Type("SWITCHING_BUTTON", 75, "switchingButton");

    @i(name = "color")
    public static final Type COLOR = new Type("COLOR", 76, "color");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.TABS)
    public static final Type TABS = new Type("TABS", 77, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.TABS);

    @i(name = "gradient")
    public static final Type GRADIENT = new Type("GRADIENT", 78, "gradient");

    @i(name = "disclosure")
    public static final Type DISCLOSURE = new Type("DISCLOSURE", 79, "disclosure");

    @i(name = "labelList")
    public static final Type LABEL_LIST = new Type("LABEL_LIST", 80, "labelList");

    private static final /* synthetic */ Type[] $values() {
        return new Type[]{HEADER, TEXT_ATOM_WITH_ICON, TEXT_SMALL, TEXT_MEDIUM, TEXT_FOOTER, TEXT_SUBTEXT, CHECKBOX, CHECKBOXES, BULLET_ELEMENTS, BUTTON, BUTTON_SMALL, BUTTON_SECONDARY, BUTTON_SECONDARY_SMALL, BUTTON_BORDERLESS, BUTTON_BORDERLESS_SMALL, INPUT, VERTICAL_CONTAINER, HORIZONTAL_CONTAINER, RADIO_ITEM, PAYMENT_METHOD, PRICE_WITH_TITLE, PROGRESS_BAR, STOCK_BAR, IMAGE_CAROUSEL, CELL_DEFAULT, CELL_TOGGLE, CELL_RADIO, CELL_RADIO_GROUP, LABELS, LABEL, VARIANTS_TEXT, VARIANTS_COLOR, RATING_VERTICAL, RATING_BADGE, COLOR_VARIANTS, TEXT_VARIANTS, LIST_ELEMENT_ICON_TEXT_MEDIUM, LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM, LIST_ELEMENT_NUMBERED, LIST_ELEMENT_TABLE_ROW, LIST_ELEMENT_BULLET, LIST_ELEMENT, BULLET_LIST, NUMBERED_LIST, CELL_REGULAR_24ICON_PICKER, CELL_REGULAR_PICKER, CELL_WITH_SUBTITLE_48ICON, CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO, CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO, CELL_WITH_SUBTITLE_32ICON, CELL_WITH_SUBTITLE_40ICON, CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO, CELL_WITH_SUBTITLE_24ICON, CELL_WITH_SUBTITLE_24ICON_PICKER, CELL_WITH_SUBTITLE_COUNTER, CELL_WITH_REVERSE_SUBTITLE_COUNTER, CELL_WITH_SUBTITLE_VALUE, CELL_WITH_SUBTITLE_TOGGLE, CELL_WITH_SUBTITLE_CHECKBOX_RADIO, CELL_WITH_SUBTITLE_DEFAULT, CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER, CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER, CELL_WITH_SUBTITLE_24ICON_COUNTER, CELL_WITH_SUBTITLE_TOGGLE_COUNTER, CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER, MULTILINE_BADGE, GRADIENT_BADGE, TIMER_BADGE, DISCLAIMER, GALLERY, SELECT, RANGE_FILTER, TIME_RANGE_FILTER, OPEN_RANGE_FILTER, AUTHOR_BLOCK, SWITCHING_BUTTON, COLOR, TABS, GRADIENT, DISCLOSURE, LABEL_LIST};
    }

    static {
        Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Type(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a<Type> getEntries() {
        return $ENTRIES;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
