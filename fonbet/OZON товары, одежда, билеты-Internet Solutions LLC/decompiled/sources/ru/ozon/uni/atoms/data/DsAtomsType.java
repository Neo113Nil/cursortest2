package ru.ozon.uni.atoms.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bG\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJ¨\u0006K"}, d2 = {"Lru/ozon/uni/atoms/data/DsAtomsType;", "Lru/ozon/uni/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ASPECT", "BADGE", "DISCLAIMER", "BADGE_LIST", "ICON", "INDICATOR", "CHECKBOX", "RADIOBUTTON", "TOGGLE", "TITLE_SUBTITLE_CELL", "ICON_TITLE_SUBTITLE_CELL", "BADGE_TITLE_SUBTITLE_CELL", "BADGE_ICON_TITLE_SUBTITLE_CELL", "INDICATOR_TITLE_SUBTITLE_CELL", "INDICATOR_ICON_TITLE_SUBTITLE_CELL", "INDICATOR_BADGE_TITLE_SUBTITLE_CELL", "INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL", "DISCLOSURE_TITLE_SUBTITLE_CELL", "DISCLOSURE_ICON_TITLE_SUBTITLE_CELL", "DISCLOSURE_BADGE_TITLE_SUBTITLE_CELL", "DISCLOSURE_BADGE_ICON_TITLE_SUBTITLE_CELL", "DISCLOSURE_INDICATOR_TITLE_SUBTITLE_CELL", "DISCLOSURE_INDICATOR_ICON_TITLE_SUBTITLE_CELL", "DISCLOSURE_INDICATOR_BADGE_TITLE_SUBTITLE_CELL", "DISCLOSURE_INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL", "CHECKBOX_TITLE_SUBTITLE_CELL", "RADIO_TITLE_SUBTITLE_CELL", "TOGGLE_TITLE_SUBTITLE_CELL", "BUTTON", "ICON_BUTTON", "BUTTON_V3", "ICON_BUTTON_V3", "TAG_BUTTON", "ICON_LABEL_BUTTON", "ICON_CELL_CARD", "INDICATOR_LABEL_BUTTON", "DATA_BUTTON", "UNCONTAINED_BUTTON", "UNCONTAINED_ICON_LABEL_BUTTON", "CHIP", "ICON_CHIP", "INDICATOR_LABEL_CHIP", "TEXT", "EXPANDABLE_TEXT", "ORDERED_LIST_CELL", "UNORDERED_LIST_CELL", "IMAGE", "IMAGE_FIXED", "IMAGE_TITLE_SUBTITLE_CELL", "BUTTON_TITLE_SUBTITLE_CELL", "BUTTON_ICON_TITLE_SUBTITLE_CELL", "ICON_BUTTON_TITLE_SUBTITLE_CELL", "ICON_BUTTON_ICON_TITLE_SUBTITLE_CELL", "PRODUCT_MEDIA", "PRICE_V2", "DS_RATING", "LABEL_RATING", "CELL", "NOTIFICATION", "TIMER", "NOTIFICATION_WITHOUT_ICON", "NOTIFICATION_WITH_ICON", "INPUT_SELECT_BUTTON", "TABS", "TEST_COMPOSE", "COUNT_PICKER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsAtomsType implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsAtomsType[] $VALUES;

    @NotNull
    private final String value;

    @i(name = "aspect")
    public static final DsAtomsType ASPECT = new DsAtomsType("ASPECT", 0, "aspect");

    @i(name = "dsBadge")
    public static final DsAtomsType BADGE = new DsAtomsType("BADGE", 1, "dsBadge");

    @i(name = SelectionItemFormDTO.DISCLAIMER_FIELD_NAME)
    public static final DsAtomsType DISCLAIMER = new DsAtomsType("DISCLAIMER", 2, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);

    @i(name = "dsBadgeList")
    public static final DsAtomsType BADGE_LIST = new DsAtomsType("BADGE_LIST", 3, "dsBadgeList");

    @i(name = "icon")
    public static final DsAtomsType ICON = new DsAtomsType("ICON", 4, "icon");

    @i(name = "indicator")
    public static final DsAtomsType INDICATOR = new DsAtomsType("INDICATOR", 5, "indicator");

    @i(name = "checkbox")
    public static final DsAtomsType CHECKBOX = new DsAtomsType("CHECKBOX", 6, "checkbox");

    @i(name = "radiobutton")
    public static final DsAtomsType RADIOBUTTON = new DsAtomsType("RADIOBUTTON", 7, "radiobutton");

    @i(name = "toggle")
    public static final DsAtomsType TOGGLE = new DsAtomsType("TOGGLE", 8, "toggle");

    @i(name = "titleSubtitleCell")
    public static final DsAtomsType TITLE_SUBTITLE_CELL = new DsAtomsType("TITLE_SUBTITLE_CELL", 9, "titleSubtitleCell");

    @i(name = "iconTitleSubtitleCell")
    public static final DsAtomsType ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("ICON_TITLE_SUBTITLE_CELL", 10, "iconTitleSubtitleCell");

    @i(name = "badgeTitleSubtitleCell")
    public static final DsAtomsType BADGE_TITLE_SUBTITLE_CELL = new DsAtomsType("BADGE_TITLE_SUBTITLE_CELL", 11, "badgeTitleSubtitleCell");

    @i(name = "badgeIconTitleSubtitleCell")
    public static final DsAtomsType BADGE_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("BADGE_ICON_TITLE_SUBTITLE_CELL", 12, "badgeIconTitleSubtitleCell");

    @i(name = "indicatorTitleSubtitleCell")
    public static final DsAtomsType INDICATOR_TITLE_SUBTITLE_CELL = new DsAtomsType("INDICATOR_TITLE_SUBTITLE_CELL", 13, "indicatorTitleSubtitleCell");

    @i(name = "indicatorIconTitleSubtitleCell")
    public static final DsAtomsType INDICATOR_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("INDICATOR_ICON_TITLE_SUBTITLE_CELL", 14, "indicatorIconTitleSubtitleCell");

    @i(name = "indicatorBadgeTitleSubtitleCell")
    public static final DsAtomsType INDICATOR_BADGE_TITLE_SUBTITLE_CELL = new DsAtomsType("INDICATOR_BADGE_TITLE_SUBTITLE_CELL", 15, "indicatorBadgeTitleSubtitleCell");

    @i(name = "indicatorBadgeIconTitleSubtitleCell")
    public static final DsAtomsType INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL", 16, "indicatorBadgeIconTitleSubtitleCell");

    @i(name = "disclosureTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_TITLE_SUBTITLE_CELL", 17, "disclosureTitleSubtitleCell");

    @i(name = "disclosureIconTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_ICON_TITLE_SUBTITLE_CELL", 18, "disclosureIconTitleSubtitleCell");

    @i(name = "disclosureBadgeTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_BADGE_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_BADGE_TITLE_SUBTITLE_CELL", 19, "disclosureBadgeTitleSubtitleCell");

    @i(name = "disclosureBadgeIconTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_BADGE_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_BADGE_ICON_TITLE_SUBTITLE_CELL", 20, "disclosureBadgeIconTitleSubtitleCell");

    @i(name = "disclosureIndicatorTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_INDICATOR_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_INDICATOR_TITLE_SUBTITLE_CELL", 21, "disclosureIndicatorTitleSubtitleCell");

    @i(name = "disclosureIndicatorIconTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_INDICATOR_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_INDICATOR_ICON_TITLE_SUBTITLE_CELL", 22, "disclosureIndicatorIconTitleSubtitleCell");

    @i(name = "disclosureIndicatorBadgeTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_INDICATOR_BADGE_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_INDICATOR_BADGE_TITLE_SUBTITLE_CELL", 23, "disclosureIndicatorBadgeTitleSubtitleCell");

    @i(name = "disclosureIndicatorBadgeIconTitleSubtitleCell")
    public static final DsAtomsType DISCLOSURE_INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("DISCLOSURE_INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL", 24, "disclosureIndicatorBadgeIconTitleSubtitleCell");

    @i(name = "checkboxTitleSubtitleCell")
    public static final DsAtomsType CHECKBOX_TITLE_SUBTITLE_CELL = new DsAtomsType("CHECKBOX_TITLE_SUBTITLE_CELL", 25, "checkboxTitleSubtitleCell");

    @i(name = "radioTitleSubtitleCell")
    public static final DsAtomsType RADIO_TITLE_SUBTITLE_CELL = new DsAtomsType("RADIO_TITLE_SUBTITLE_CELL", 26, "radioTitleSubtitleCell");

    @i(name = "toggleTitleSubtitleCell")
    public static final DsAtomsType TOGGLE_TITLE_SUBTITLE_CELL = new DsAtomsType("TOGGLE_TITLE_SUBTITLE_CELL", 27, "toggleTitleSubtitleCell");

    @i(name = "button")
    public static final DsAtomsType BUTTON = new DsAtomsType("BUTTON", 28, "button");

    @i(name = "iconButton")
    public static final DsAtomsType ICON_BUTTON = new DsAtomsType("ICON_BUTTON", 29, "iconButton");

    @i(name = "buttonV3")
    public static final DsAtomsType BUTTON_V3 = new DsAtomsType("BUTTON_V3", 30, "buttonV3");

    @i(name = "iconButtonV3")
    public static final DsAtomsType ICON_BUTTON_V3 = new DsAtomsType("ICON_BUTTON_V3", 31, "iconButtonV3");

    @i(name = "tagButton")
    public static final DsAtomsType TAG_BUTTON = new DsAtomsType("TAG_BUTTON", 32, "tagButton");

    @i(name = "iconLabelButton")
    public static final DsAtomsType ICON_LABEL_BUTTON = new DsAtomsType("ICON_LABEL_BUTTON", 33, "iconLabelButton");

    @i(name = "iconCellCard")
    public static final DsAtomsType ICON_CELL_CARD = new DsAtomsType("ICON_CELL_CARD", 34, "iconCellCard");

    @i(name = "indicatorLabelButton")
    public static final DsAtomsType INDICATOR_LABEL_BUTTON = new DsAtomsType("INDICATOR_LABEL_BUTTON", 35, "indicatorLabelButton");

    @i(name = "dataButton")
    public static final DsAtomsType DATA_BUTTON = new DsAtomsType("DATA_BUTTON", 36, "dataButton");

    @i(name = "uncontainedButton")
    public static final DsAtomsType UNCONTAINED_BUTTON = new DsAtomsType("UNCONTAINED_BUTTON", 37, "uncontainedButton");

    @i(name = "uncontainedIconLabelButton")
    public static final DsAtomsType UNCONTAINED_ICON_LABEL_BUTTON = new DsAtomsType("UNCONTAINED_ICON_LABEL_BUTTON", 38, "uncontainedIconLabelButton");

    @i(name = "chip")
    public static final DsAtomsType CHIP = new DsAtomsType("CHIP", 39, "chip");

    @i(name = "iconChip")
    public static final DsAtomsType ICON_CHIP = new DsAtomsType("ICON_CHIP", 40, "iconChip");

    @i(name = "indicatorLabelChip")
    public static final DsAtomsType INDICATOR_LABEL_CHIP = new DsAtomsType("INDICATOR_LABEL_CHIP", 41, "indicatorLabelChip");

    @i(name = "text")
    public static final DsAtomsType TEXT = new DsAtomsType("TEXT", 42, "text");

    @i(name = CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME)
    public static final DsAtomsType EXPANDABLE_TEXT = new DsAtomsType("EXPANDABLE_TEXT", 43, CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME);

    @i(name = "orderedListCell")
    public static final DsAtomsType ORDERED_LIST_CELL = new DsAtomsType("ORDERED_LIST_CELL", 44, "orderedListCell");

    @i(name = "unorderedListCell")
    public static final DsAtomsType UNORDERED_LIST_CELL = new DsAtomsType("UNORDERED_LIST_CELL", 45, "unorderedListCell");

    @i(name = "image")
    public static final DsAtomsType IMAGE = new DsAtomsType("IMAGE", 46, "image");

    @i(name = "imageFixed")
    public static final DsAtomsType IMAGE_FIXED = new DsAtomsType("IMAGE_FIXED", 47, "imageFixed");

    @i(name = "imageTitleSubtitleCell")
    public static final DsAtomsType IMAGE_TITLE_SUBTITLE_CELL = new DsAtomsType("IMAGE_TITLE_SUBTITLE_CELL", 48, "imageTitleSubtitleCell");

    @i(name = "buttonTitleSubtitleCell")
    public static final DsAtomsType BUTTON_TITLE_SUBTITLE_CELL = new DsAtomsType("BUTTON_TITLE_SUBTITLE_CELL", 49, "buttonTitleSubtitleCell");

    @i(name = "buttonIconTitleSubtitleCell")
    public static final DsAtomsType BUTTON_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("BUTTON_ICON_TITLE_SUBTITLE_CELL", 50, "buttonIconTitleSubtitleCell");

    @i(name = "IconButtonTitleSubtitleCell")
    public static final DsAtomsType ICON_BUTTON_TITLE_SUBTITLE_CELL = new DsAtomsType("ICON_BUTTON_TITLE_SUBTITLE_CELL", 51, "iconButtonTitleSubtitleCell");

    @i(name = "IconButtonIconTitleSubtitleCell")
    public static final DsAtomsType ICON_BUTTON_ICON_TITLE_SUBTITLE_CELL = new DsAtomsType("ICON_BUTTON_ICON_TITLE_SUBTITLE_CELL", 52, "iconButtonIconTitleSubtitleCell");

    @i(name = "productMedia")
    public static final DsAtomsType PRODUCT_MEDIA = new DsAtomsType("PRODUCT_MEDIA", 53, "productMedia");

    @i(name = DynamicElementDTO.PRICE_V2)
    public static final DsAtomsType PRICE_V2 = new DsAtomsType("PRICE_V2", 54, DynamicElementDTO.PRICE_V2);

    @i(name = "dsRating")
    public static final DsAtomsType DS_RATING = new DsAtomsType("DS_RATING", 55, "dsRating");

    @i(name = "labelRating")
    public static final DsAtomsType LABEL_RATING = new DsAtomsType("LABEL_RATING", 56, "labelRating");

    @i(name = "cell")
    public static final DsAtomsType CELL = new DsAtomsType("CELL", 57, "cell");

    @i(name = "notificationBar")
    public static final DsAtomsType NOTIFICATION = new DsAtomsType("NOTIFICATION", 58, "notificationBar");

    @i(name = DynamicElementDTO.TIMER)
    public static final DsAtomsType TIMER = new DsAtomsType("TIMER", 59, DynamicElementDTO.TIMER);

    @i(name = "notification")
    public static final DsAtomsType NOTIFICATION_WITHOUT_ICON = new DsAtomsType("NOTIFICATION_WITHOUT_ICON", 60, "notification");

    @i(name = "notificationWithIcon")
    public static final DsAtomsType NOTIFICATION_WITH_ICON = new DsAtomsType("NOTIFICATION_WITH_ICON", 61, "notificationWithIcon");

    @i(name = "inputSelectButton")
    public static final DsAtomsType INPUT_SELECT_BUTTON = new DsAtomsType("INPUT_SELECT_BUTTON", 62, "inputSelectButton");

    @i(name = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.TABS)
    public static final DsAtomsType TABS = new DsAtomsType("TABS", 63, ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.TABS);

    @i(name = "testCompose")
    public static final DsAtomsType TEST_COMPOSE = new DsAtomsType("TEST_COMPOSE", 64, "testCompose");

    @i(name = "countPicker")
    public static final DsAtomsType COUNT_PICKER = new DsAtomsType("COUNT_PICKER", 65, "countPicker");

    private static final /* synthetic */ DsAtomsType[] $values() {
        return new DsAtomsType[]{ASPECT, BADGE, DISCLAIMER, BADGE_LIST, ICON, INDICATOR, CHECKBOX, RADIOBUTTON, TOGGLE, TITLE_SUBTITLE_CELL, ICON_TITLE_SUBTITLE_CELL, BADGE_TITLE_SUBTITLE_CELL, BADGE_ICON_TITLE_SUBTITLE_CELL, INDICATOR_TITLE_SUBTITLE_CELL, INDICATOR_ICON_TITLE_SUBTITLE_CELL, INDICATOR_BADGE_TITLE_SUBTITLE_CELL, INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL, DISCLOSURE_TITLE_SUBTITLE_CELL, DISCLOSURE_ICON_TITLE_SUBTITLE_CELL, DISCLOSURE_BADGE_TITLE_SUBTITLE_CELL, DISCLOSURE_BADGE_ICON_TITLE_SUBTITLE_CELL, DISCLOSURE_INDICATOR_TITLE_SUBTITLE_CELL, DISCLOSURE_INDICATOR_ICON_TITLE_SUBTITLE_CELL, DISCLOSURE_INDICATOR_BADGE_TITLE_SUBTITLE_CELL, DISCLOSURE_INDICATOR_BADGE_ICON_TITLE_SUBTITLE_CELL, CHECKBOX_TITLE_SUBTITLE_CELL, RADIO_TITLE_SUBTITLE_CELL, TOGGLE_TITLE_SUBTITLE_CELL, BUTTON, ICON_BUTTON, BUTTON_V3, ICON_BUTTON_V3, TAG_BUTTON, ICON_LABEL_BUTTON, ICON_CELL_CARD, INDICATOR_LABEL_BUTTON, DATA_BUTTON, UNCONTAINED_BUTTON, UNCONTAINED_ICON_LABEL_BUTTON, CHIP, ICON_CHIP, INDICATOR_LABEL_CHIP, TEXT, EXPANDABLE_TEXT, ORDERED_LIST_CELL, UNORDERED_LIST_CELL, IMAGE, IMAGE_FIXED, IMAGE_TITLE_SUBTITLE_CELL, BUTTON_TITLE_SUBTITLE_CELL, BUTTON_ICON_TITLE_SUBTITLE_CELL, ICON_BUTTON_TITLE_SUBTITLE_CELL, ICON_BUTTON_ICON_TITLE_SUBTITLE_CELL, PRODUCT_MEDIA, PRICE_V2, DS_RATING, LABEL_RATING, CELL, NOTIFICATION, TIMER, NOTIFICATION_WITHOUT_ICON, NOTIFICATION_WITH_ICON, INPUT_SELECT_BUTTON, TABS, TEST_COMPOSE, COUNT_PICKER};
    }

    static {
        DsAtomsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsAtomsType(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a<DsAtomsType> getEntries() {
        return $ENTRIES;
    }

    public static DsAtomsType valueOf(String str) {
        return (DsAtomsType) Enum.valueOf(DsAtomsType.class, str);
    }

    public static DsAtomsType[] values() {
        return (DsAtomsType[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public String getValue() {
        return this.value;
    }
}
