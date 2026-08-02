package ru.ozon.app.android.ugc.widgets.selectionItemForm.data;

import B4.V;
import Ef0.c;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.SelectionFormCellDTO;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO;", "", "entityType", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "selectionUuid", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$HeaderDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$HeaderDTO;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)V", "getEntityType", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "getSelectionUuid", "()Ljava/lang/String;", "getHeader", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$HeaderDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getFooter", "()Ljava/lang/Object;", "Companion", "HeaderDTO", "BackSubmit", "SelectionFormTextAreaDTO", "DoubleButton", "SelectionFormCellSelectorDTO", "EntityType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemFormDTO {

    @NotNull
    public static final String BUTTON_FIELD_NAME = "button";

    @NotNull
    public static final String BUTTON_NAME = "CONTENT_TYPE_BUTTON";

    @NotNull
    public static final String CELL_FIELD_NAME = "cell";

    @NotNull
    public static final String CELL_NAME = "CONTENT_TYPE_CELL";

    @NotNull
    public static final String CELL_SELECTOR_FIELD_NAME = "cellSelector";

    @NotNull
    public static final String CELL_SELECTOR_NAME = "CONTENT_TYPE_CELL_SELECTOR";

    @NotNull
    public static final String DISCLAIMER_FIELD_NAME = "disclaimer";

    @NotNull
    public static final String DISCLAIMER_NAME = "CONTENT_TYPE_DISCLAIMER";

    @NotNull
    public static final String DOUBLE_BUTTON_FIELD_NAME = "doubleButton";

    @NotNull
    public static final String DOUBLE_BUTTON_NAME = "CONTENT_TYPE_DOUBLE_BUTTON";

    @NotNull
    public static final String ISLAND_SEPARATOR_FIELD_NAME = "islandSeparator";

    @NotNull
    public static final String ISLAND_SEPARATOR_NAME = "CONTENT_TYPE_ISLAND_SEPARATOR";

    @NotNull
    public static final String MEDIA_PICKER_FIELD_NAME = "mediaPicker";

    @NotNull
    public static final String MEDIA_PICKER_NAME = "CONTENT_TYPE_MEDIA_PICKER";

    @NotNull
    public static final String PLAIN_TEXT_FIELD_NAME = "plainText";

    @NotNull
    public static final String PLAIN_TEXT_NAME = "CONTENT_TYPE_PLAIN_TEXT";

    @NotNull
    public static final String PRODUCT_PICKER_FIELD_NAME = "productPicker";

    @NotNull
    public static final String PRODUCT_PICKER_NAME = "CONTENT_TYPE_PRODUCT_PICKER";

    @NotNull
    public static final String SEPARATOR_FIELD_NAME = "separator";

    @NotNull
    public static final String SEPARATOR_NAME = "CONTENT_TYPE_SEPARATOR";

    @NotNull
    public static final String TEXT_AREA_FIELD_NAME = "textArea";

    @NotNull
    public static final String TEXT_AREA_NAME = "CONTENT_TYPE_TEXTAREA";

    @NotNull
    public static final String TITLE_FIELD_NAME = "title";

    @NotNull
    public static final String TITLE_NAME = "CONTENT_TYPE_TITLE";

    @NotNull
    private final EntityType entityType;

    @NotNull
    private final Object footer;

    @NotNull
    private final HeaderDTO header;

    @NotNull
    private final List<Object> items;
    private final String selectionUuid;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$BackSubmit;", "", "items", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeTrackingInfo", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getCloseTrackingInfo", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackSubmit {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> closeTrackingInfo;

        @NotNull
        private final List<Object> items;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BackSubmit(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "title", name = "CONTENT_TYPE_TITLE", type = TextDTO.class), @ProtoOneOfSignature(fieldName = "button", name = "CONTENT_TYPE_BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = SeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.trackingInfo = map;
            this.closeTrackingInfo = map2;
        }

        public final Map<String, TokenizedTrackingInfo> getCloseTrackingInfo() {
            return this.closeTrackingInfo;
        }

        @NotNull
        public final List<Object> getItems() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$DoubleButton;", "", "firstButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DoubleButton {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO firstButton;

        @NotNull
        private final ButtonV3DTO secondButton;

        public DoubleButton(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            this.firstButton = firstButton;
            this.secondButton = secondButton;
        }

        public static /* synthetic */ DoubleButton copy$default(DoubleButton doubleButton, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = doubleButton.firstButton;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO2 = doubleButton.secondButton;
            }
            return doubleButton.copy(buttonV3DTO, buttonV3DTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getFirstButton() {
            return this.firstButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getSecondButton() {
            return this.secondButton;
        }

        @NotNull
        public final DoubleButton copy(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            return new DoubleButton(firstButton, secondButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DoubleButton)) {
                return false;
            }
            DoubleButton doubleButton = (DoubleButton) other;
            return Intrinsics.d(this.firstButton, doubleButton.firstButton) && Intrinsics.d(this.secondButton, doubleButton.secondButton);
        }

        @NotNull
        public final ButtonV3DTO getFirstButton() {
            return this.firstButton;
        }

        @NotNull
        public final ButtonV3DTO getSecondButton() {
            return this.secondButton;
        }

        public int hashCode() {
            return this.secondButton.hashCode() + (this.firstButton.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DoubleButton(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "", "<init>", "(Ljava/lang/String;I)V", "ENTITY_TYPE_SELECTION", "ENTITY_TYPE_POST", "ENTITY_TYPE_WISHLIST_GIFT", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EntityType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EntityType[] $VALUES;
        public static final EntityType ENTITY_TYPE_SELECTION = new EntityType("ENTITY_TYPE_SELECTION", 0);
        public static final EntityType ENTITY_TYPE_POST = new EntityType("ENTITY_TYPE_POST", 1);
        public static final EntityType ENTITY_TYPE_WISHLIST_GIFT = new EntityType("ENTITY_TYPE_WISHLIST_GIFT", 2);

        private static final /* synthetic */ EntityType[] $values() {
            return new EntityType[]{ENTITY_TYPE_SELECTION, ENTITY_TYPE_POST, ENTITY_TYPE_WISHLIST_GIFT};
        }

        static {
            EntityType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EntityType(String str, int i11) {
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$HeaderDTO;", "", "backButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "rightButton", "backSubmit", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$BackSubmit;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$BackSubmit;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRightButton", "getBackSubmit", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$BackSubmit;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeaderDTO {
        public static final int $stable = 8;

        @NotNull
        private final IconButtonV3DTO backButton;
        private final BackSubmit backSubmit;
        private final IconButtonV3DTO rightButton;
        private final TextDTO subtitle;
        private final TextDTO title;

        public HeaderDTO(@NotNull IconButtonV3DTO backButton, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, BackSubmit backSubmit) {
            Intrinsics.checkNotNullParameter(backButton, "backButton");
            this.backButton = backButton;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.rightButton = iconButtonV3DTO;
            this.backSubmit = backSubmit;
        }

        @NotNull
        public final IconButtonV3DTO getBackButton() {
            return this.backButton;
        }

        public final BackSubmit getBackSubmit() {
            return this.backSubmit;
        }

        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$SelectionFormCellSelectorDTO;", "", "uploadKey", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "selected", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)V", "getUploadKey", "()Ljava/lang/String;", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSelected", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionFormCellSelectorDTO {
        public static final int $stable = 8;
        private final boolean isSelected;

        @NotNull
        private final CellDTO normal;
        private final CellDTO selected;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String uploadKey;

        public SelectionFormCellSelectorDTO(@NotNull String uploadKey, boolean z11, @NotNull CellDTO normal, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.uploadKey = uploadKey;
            this.isSelected = z11;
            this.normal = normal;
            this.selected = cellDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ SelectionFormCellSelectorDTO copy$default(SelectionFormCellSelectorDTO selectionFormCellSelectorDTO, String str, boolean z11, CellDTO cellDTO, CellDTO cellDTO2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectionFormCellSelectorDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                z11 = selectionFormCellSelectorDTO.isSelected;
            }
            if ((i11 & 4) != 0) {
                cellDTO = selectionFormCellSelectorDTO.normal;
            }
            if ((i11 & 8) != 0) {
                cellDTO2 = selectionFormCellSelectorDTO.selected;
            }
            if ((i11 & 16) != 0) {
                map = selectionFormCellSelectorDTO.trackingInfo;
            }
            Map map2 = map;
            CellDTO cellDTO3 = cellDTO;
            return selectionFormCellSelectorDTO.copy(str, z11, cellDTO3, cellDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CellDTO getNormal() {
            return this.normal;
        }

        /* renamed from: component4, reason: from getter */
        public final CellDTO getSelected() {
            return this.selected;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final SelectionFormCellSelectorDTO copy(@NotNull String uploadKey, boolean isSelected, @NotNull CellDTO normal, CellDTO selected, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new SelectionFormCellSelectorDTO(uploadKey, isSelected, normal, selected, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionFormCellSelectorDTO)) {
                return false;
            }
            SelectionFormCellSelectorDTO selectionFormCellSelectorDTO = (SelectionFormCellSelectorDTO) other;
            return Intrinsics.d(this.uploadKey, selectionFormCellSelectorDTO.uploadKey) && this.isSelected == selectionFormCellSelectorDTO.isSelected && Intrinsics.d(this.normal, selectionFormCellSelectorDTO.normal) && Intrinsics.d(this.selected, selectionFormCellSelectorDTO.selected) && Intrinsics.d(this.trackingInfo, selectionFormCellSelectorDTO.trackingInfo);
        }

        @NotNull
        public final CellDTO getNormal() {
            return this.normal;
        }

        public final CellDTO getSelected() {
            return this.selected;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int c11 = Bi.b.c(this.normal, C3532b.a(this.uploadKey.hashCode() * 31, 31, this.isSelected), 31);
            CellDTO cellDTO = this.selected;
            int hashCode = (c11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            boolean z11 = this.isSelected;
            CellDTO cellDTO = this.normal;
            CellDTO cellDTO2 = this.selected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = C4636t5.b("SelectionFormCellSelectorDTO(uploadKey=", str, ", isSelected=", ", normal=", z11);
            b11.append(cellDTO);
            b11.append(", selected=");
            b11.append(cellDTO2);
            b11.append(", trackingInfo=");
            return P.f(b11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u009c\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$SelectionFormTextAreaDTO;", "", "uploadKey", "", HammersV3BodyDTO.PLACEHOLDER, "text", "hint", "errorRequiredText", "showCounter", "", "maxCounterValue", "", "maxLinesCount", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "errorViewTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)V", "getUploadKey", "()Ljava/lang/String;", "getPlaceholder", "getText", "getHint", "getErrorRequiredText", "getShowCounter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCounterValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxLinesCount", "getTrackingInfo", "()Ljava/util/Map;", "getErrorViewTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$SelectionFormTextAreaDTO;", "equals", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionFormTextAreaDTO {
        public static final int $stable = 8;
        private final String errorRequiredText;
        private final Map<String, TokenizedTrackingInfo> errorViewTrackingInfo;
        private final String hint;
        private final Integer maxCounterValue;
        private final Integer maxLinesCount;
        private final String placeholder;
        private final Boolean showCounter;
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String uploadKey;

        public SelectionFormTextAreaDTO(@NotNull String uploadKey, String str, String str2, String str3, String str4, Boolean bool, Integer num, Integer num2, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            this.uploadKey = uploadKey;
            this.placeholder = str;
            this.text = str2;
            this.hint = str3;
            this.errorRequiredText = str4;
            this.showCounter = bool;
            this.maxCounterValue = num;
            this.maxLinesCount = num2;
            this.trackingInfo = map;
            this.errorViewTrackingInfo = map2;
        }

        public static /* synthetic */ SelectionFormTextAreaDTO copy$default(SelectionFormTextAreaDTO selectionFormTextAreaDTO, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Integer num2, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectionFormTextAreaDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                str2 = selectionFormTextAreaDTO.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = selectionFormTextAreaDTO.text;
            }
            if ((i11 & 8) != 0) {
                str4 = selectionFormTextAreaDTO.hint;
            }
            if ((i11 & 16) != 0) {
                str5 = selectionFormTextAreaDTO.errorRequiredText;
            }
            if ((i11 & 32) != 0) {
                bool = selectionFormTextAreaDTO.showCounter;
            }
            if ((i11 & 64) != 0) {
                num = selectionFormTextAreaDTO.maxCounterValue;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                num2 = selectionFormTextAreaDTO.maxLinesCount;
            }
            if ((i11 & 256) != 0) {
                map = selectionFormTextAreaDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map2 = selectionFormTextAreaDTO.errorViewTrackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            Integer num3 = num;
            Integer num4 = num2;
            String str6 = str5;
            Boolean bool2 = bool;
            return selectionFormTextAreaDTO.copy(str, str2, str3, str4, str6, bool2, num3, num4, map3, map4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.errorViewTrackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getShowCounter() {
            return this.showCounter;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMaxCounterValue() {
            return this.maxCounterValue;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getMaxLinesCount() {
            return this.maxLinesCount;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final SelectionFormTextAreaDTO copy(@NotNull String uploadKey, String placeholder, String text, String hint, String errorRequiredText, Boolean showCounter, Integer maxCounterValue, Integer maxLinesCount, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> errorViewTrackingInfo) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            return new SelectionFormTextAreaDTO(uploadKey, placeholder, text, hint, errorRequiredText, showCounter, maxCounterValue, maxLinesCount, trackingInfo, errorViewTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionFormTextAreaDTO)) {
                return false;
            }
            SelectionFormTextAreaDTO selectionFormTextAreaDTO = (SelectionFormTextAreaDTO) other;
            return Intrinsics.d(this.uploadKey, selectionFormTextAreaDTO.uploadKey) && Intrinsics.d(this.placeholder, selectionFormTextAreaDTO.placeholder) && Intrinsics.d(this.text, selectionFormTextAreaDTO.text) && Intrinsics.d(this.hint, selectionFormTextAreaDTO.hint) && Intrinsics.d(this.errorRequiredText, selectionFormTextAreaDTO.errorRequiredText) && Intrinsics.d(this.showCounter, selectionFormTextAreaDTO.showCounter) && Intrinsics.d(this.maxCounterValue, selectionFormTextAreaDTO.maxCounterValue) && Intrinsics.d(this.maxLinesCount, selectionFormTextAreaDTO.maxLinesCount) && Intrinsics.d(this.trackingInfo, selectionFormTextAreaDTO.trackingInfo) && Intrinsics.d(this.errorViewTrackingInfo, selectionFormTextAreaDTO.errorViewTrackingInfo);
        }

        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        public final Map<String, TokenizedTrackingInfo> getErrorViewTrackingInfo() {
            return this.errorViewTrackingInfo;
        }

        public final String getHint() {
            return this.hint;
        }

        public final Integer getMaxCounterValue() {
            return this.maxCounterValue;
        }

        public final Integer getMaxLinesCount() {
            return this.maxLinesCount;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Boolean getShowCounter() {
            return this.showCounter;
        }

        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int hashCode = this.uploadKey.hashCode() * 31;
            String str = this.placeholder;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.hint;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorRequiredText;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.showCounter;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.maxCounterValue;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxLinesCount;
            int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.errorViewTrackingInfo;
            return hashCode9 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.placeholder;
            String str3 = this.text;
            String str4 = this.hint;
            String str5 = this.errorRequiredText;
            Boolean bool = this.showCounter;
            Integer num = this.maxCounterValue;
            Integer num2 = this.maxLinesCount;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.errorViewTrackingInfo;
            StringBuilder d11 = C3660k.d("SelectionFormTextAreaDTO(uploadKey=", str, ", placeholder=", str2, ", text=");
            Nh.a.h(d11, str3, ", hint=", str4, ", errorRequiredText=");
            Sh.a.d(bool, str5, ", showCounter=", ", maxCounterValue=", d11);
            c.e(d11, num, ", maxLinesCount=", num2, ", trackingInfo=");
            return V.c(d11, map, ", errorViewTrackingInfo=", map2, ")");
        }
    }

    public SelectionItemFormDTO(@NotNull EntityType entityType, String str, @NotNull HeaderDTO header, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "textArea", name = "CONTENT_TYPE_TEXTAREA", type = SelectionFormTextAreaDTO.class), @ProtoOneOfSignature(fieldName = "cell", name = "CONTENT_TYPE_CELL", type = SelectionFormCellDTO.class), @ProtoOneOfSignature(fieldName = "islandSeparator", name = "CONTENT_TYPE_ISLAND_SEPARATOR", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = SeparatorDTO.class), @ProtoOneOfSignature(fieldName = "disclaimer", name = "CONTENT_TYPE_DISCLAIMER", type = DisclaimerDTO.class), @ProtoOneOfSignature(fieldName = "mediaPicker", name = "CONTENT_TYPE_MEDIA_PICKER", type = MediaPickerDTO.class), @ProtoOneOfSignature(fieldName = "productPicker", name = "CONTENT_TYPE_PRODUCT_PICKER", type = ProductPickerDTO.class), @ProtoOneOfSignature(fieldName = "plainText", name = "CONTENT_TYPE_PLAIN_TEXT", type = PlainTextDTO.class), @ProtoOneOfSignature(fieldName = "cellSelector", name = "CONTENT_TYPE_CELL_SELECTOR", type = SelectionFormCellSelectorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "CONTENT_TYPE_BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "doubleButton", name = "CONTENT_TYPE_DOUBLE_BUTTON", type = DoubleButton.class)}) @NotNull @ProtoOneOf(label = "type") Object footer) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.entityType = entityType;
        this.selectionUuid = str;
        this.header = header;
        this.trackingInfo = map;
        this.items = items;
        this.footer = footer;
    }

    @NotNull
    public final EntityType getEntityType() {
        return this.entityType;
    }

    @NotNull
    public final Object getFooter() {
        return this.footer;
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final String getSelectionUuid() {
        return this.selectionUuid;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }
}
