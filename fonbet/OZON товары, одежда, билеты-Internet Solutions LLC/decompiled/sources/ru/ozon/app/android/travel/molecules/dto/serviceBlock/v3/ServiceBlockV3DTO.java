package ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3;

import B90.C2619v;
import HY.a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005789:;By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\bHÆ\u0003J\u008f\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001c¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "content", "moreAction", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "travelBadgesList", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "price", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;", "changeServiceButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nextOptionBenefitDescription", "nextOptionPrice", "additionalInfoList", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$AdditionalInfo;", "copyBlockList", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyBlock;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getContent", "getMoreAction", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getTravelBadgesList", "()Ljava/util/List;", "getPrice", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;", "getChangeServiceButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getNextOptionBenefitDescription", "getNextOptionPrice", "getAdditionalInfoList", "getCopyBlockList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Price", "AdditionalInfo", "CopyBlock", "CopyItem", "CopyAction", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ServiceBlockV3DTO {
    private final List<AdditionalInfo> additionalInfoList;
    private final ButtonV3Atom.SmallButton changeServiceButton;

    @NotNull
    private final TextAtom content;
    private final List<CopyBlock> copyBlockList;
    private final LinkButtonDTO moreAction;
    private final TextAtom nextOptionBenefitDescription;
    private final Price nextOptionPrice;
    private final Price price;

    @NotNull
    private final TextAtom title;
    private final List<TravelBadgeDTO> travelBadgesList;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$AdditionalInfo;", "", "info", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;)V", "getInfo", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        private final ListElementAtom.Marker.Icon icon;

        @NotNull
        private final TextAtom info;

        public AdditionalInfo(@NotNull TextAtom info, ListElementAtom.Marker.Icon icon) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
            this.icon = icon;
        }

        public static /* synthetic */ AdditionalInfo copy$default(AdditionalInfo additionalInfo, TextAtom textAtom, ListElementAtom.Marker.Icon icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = additionalInfo.info;
            }
            if ((i11 & 2) != 0) {
                icon = additionalInfo.icon;
            }
            return additionalInfo.copy(textAtom, icon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getInfo() {
            return this.info;
        }

        /* renamed from: component2, reason: from getter */
        public final ListElementAtom.Marker.Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final AdditionalInfo copy(@NotNull TextAtom info, ListElementAtom.Marker.Icon icon) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new AdditionalInfo(info, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return Intrinsics.d(this.info, additionalInfo.info) && Intrinsics.d(this.icon, additionalInfo.icon);
        }

        public final ListElementAtom.Marker.Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getInfo() {
            return this.info;
        }

        public int hashCode() {
            int hashCode = this.info.hashCode() * 31;
            ListElementAtom.Marker.Icon icon = this.icon;
            return hashCode + (icon == null ? 0 : icon.hashCode());
        }

        @NotNull
        public String toString() {
            return "AdditionalInfo(info=" + this.info + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyAction;", "", "clipboardText", "", "restrictionMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClipboardText", "()Ljava/lang/String;", "getRestrictionMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyAction {

        @NotNull
        private final String clipboardText;

        @NotNull
        private final String restrictionMessage;

        public CopyAction(@NotNull String clipboardText, @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            this.clipboardText = clipboardText;
            this.restrictionMessage = restrictionMessage;
        }

        public static /* synthetic */ CopyAction copy$default(CopyAction copyAction, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = copyAction.clipboardText;
            }
            if ((i11 & 2) != 0) {
                str2 = copyAction.restrictionMessage;
            }
            return copyAction.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        @NotNull
        public final CopyAction copy(@NotNull String clipboardText, @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            return new CopyAction(clipboardText, restrictionMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyAction)) {
                return false;
            }
            CopyAction copyAction = (CopyAction) other;
            return Intrinsics.d(this.clipboardText, copyAction.clipboardText) && Intrinsics.d(this.restrictionMessage, copyAction.restrictionMessage);
        }

        @NotNull
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        public int hashCode() {
            return this.restrictionMessage.hashCode() + (this.clipboardText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("CopyAction(clipboardText=", this.clipboardText, ", restrictionMessage=", this.restrictionMessage, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyBlock;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "clipboard", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyItem;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyItem;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getClipboard", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyBlock {

        @NotNull
        private final CopyItem clipboard;

        @NotNull
        private final TextAtom text;

        public CopyBlock(@NotNull TextAtom text, @NotNull CopyItem clipboard) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(clipboard, "clipboard");
            this.text = text;
            this.clipboard = clipboard;
        }

        public static /* synthetic */ CopyBlock copy$default(CopyBlock copyBlock, TextAtom textAtom, CopyItem copyItem, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = copyBlock.text;
            }
            if ((i11 & 2) != 0) {
                copyItem = copyBlock.clipboard;
            }
            return copyBlock.copy(textAtom, copyItem);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CopyItem getClipboard() {
            return this.clipboard;
        }

        @NotNull
        public final CopyBlock copy(@NotNull TextAtom text, @NotNull CopyItem clipboard) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(clipboard, "clipboard");
            return new CopyBlock(text, clipboard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyBlock)) {
                return false;
            }
            CopyBlock copyBlock = (CopyBlock) other;
            return Intrinsics.d(this.text, copyBlock.text) && Intrinsics.d(this.clipboard, copyBlock.clipboard);
        }

        @NotNull
        public final CopyItem getClipboard() {
            return this.clipboard;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.clipboard.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CopyBlock(text=" + this.text + ", clipboard=" + this.clipboard + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyItem;", "", "icon", "", "action", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyAction;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyAction;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyItem {

        @NotNull
        private final CopyAction action;

        @NotNull
        private final String icon;

        public CopyItem(@NotNull String icon, @NotNull CopyAction action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
        }

        public static /* synthetic */ CopyItem copy$default(CopyItem copyItem, String str, CopyAction copyAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = copyItem.icon;
            }
            if ((i11 & 2) != 0) {
                copyAction = copyItem.action;
            }
            return copyItem.copy(str, copyAction);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CopyAction getAction() {
            return this.action;
        }

        @NotNull
        public final CopyItem copy(@NotNull String icon, @NotNull CopyAction action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new CopyItem(icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyItem)) {
                return false;
            }
            CopyItem copyItem = (CopyItem) other;
            return Intrinsics.d(this.icon, copyItem.icon) && Intrinsics.d(this.action, copyItem.action);
        }

        @NotNull
        public final CopyAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CopyItem(icon=" + this.icon + ", action=" + this.action + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$Price;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;)V", "getTitle", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {
        private final ru.ozon.uni.atoms.data.price.Price price;
        private final String title;

        public Price(String str, ru.ozon.uni.atoms.data.price.Price price) {
            this.title = str;
            this.price = price;
        }

        public static /* synthetic */ Price copy$default(Price price, String str, ru.ozon.uni.atoms.data.price.Price price2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = price.title;
            }
            if ((i11 & 2) != 0) {
                price2 = price.price;
            }
            return price.copy(str, price2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final ru.ozon.uni.atoms.data.price.Price getPrice() {
            return this.price;
        }

        @NotNull
        public final Price copy(String title, ru.ozon.uni.atoms.data.price.Price price) {
            return new Price(title, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.title, price.title) && Intrinsics.d(this.price, price.price);
        }

        public final ru.ozon.uni.atoms.data.price.Price getPrice() {
            return this.price;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ru.ozon.uni.atoms.data.price.Price price = this.price;
            return hashCode + (price != null ? price.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Price(title=" + this.title + ", price=" + this.price + ")";
        }
    }

    public ServiceBlockV3DTO(@NotNull TextAtom title, @NotNull TextAtom content, LinkButtonDTO linkButtonDTO, List<TravelBadgeDTO> list, Price price, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom, Price price2, List<AdditionalInfo> list2, List<CopyBlock> list3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.title = title;
        this.content = content;
        this.moreAction = linkButtonDTO;
        this.travelBadgesList = list;
        this.price = price;
        this.changeServiceButton = smallButton;
        this.nextOptionBenefitDescription = textAtom;
        this.nextOptionPrice = price2;
        this.additionalInfoList = list2;
        this.copyBlockList = list3;
    }

    public static /* synthetic */ ServiceBlockV3DTO copy$default(ServiceBlockV3DTO serviceBlockV3DTO, TextAtom textAtom, TextAtom textAtom2, LinkButtonDTO linkButtonDTO, List list, Price price, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom3, Price price2, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = serviceBlockV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = serviceBlockV3DTO.content;
        }
        if ((i11 & 4) != 0) {
            linkButtonDTO = serviceBlockV3DTO.moreAction;
        }
        if ((i11 & 8) != 0) {
            list = serviceBlockV3DTO.travelBadgesList;
        }
        if ((i11 & 16) != 0) {
            price = serviceBlockV3DTO.price;
        }
        if ((i11 & 32) != 0) {
            smallButton = serviceBlockV3DTO.changeServiceButton;
        }
        if ((i11 & 64) != 0) {
            textAtom3 = serviceBlockV3DTO.nextOptionBenefitDescription;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            price2 = serviceBlockV3DTO.nextOptionPrice;
        }
        if ((i11 & 256) != 0) {
            list2 = serviceBlockV3DTO.additionalInfoList;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list3 = serviceBlockV3DTO.copyBlockList;
        }
        List list4 = list2;
        List list5 = list3;
        TextAtom textAtom4 = textAtom3;
        Price price3 = price2;
        Price price4 = price;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        return serviceBlockV3DTO.copy(textAtom, textAtom2, linkButtonDTO, list, price4, smallButton2, textAtom4, price3, list4, list5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final List<CopyBlock> component10() {
        return this.copyBlockList;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkButtonDTO getMoreAction() {
        return this.moreAction;
    }

    public final List<TravelBadgeDTO> component4() {
        return this.travelBadgesList;
    }

    /* renamed from: component5, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallButton getChangeServiceButton() {
        return this.changeServiceButton;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getNextOptionBenefitDescription() {
        return this.nextOptionBenefitDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final Price getNextOptionPrice() {
        return this.nextOptionPrice;
    }

    public final List<AdditionalInfo> component9() {
        return this.additionalInfoList;
    }

    @NotNull
    public final ServiceBlockV3DTO copy(@NotNull TextAtom title, @NotNull TextAtom content, LinkButtonDTO moreAction, List<TravelBadgeDTO> travelBadgesList, Price price, ButtonV3Atom.SmallButton changeServiceButton, TextAtom nextOptionBenefitDescription, Price nextOptionPrice, List<AdditionalInfo> additionalInfoList, List<CopyBlock> copyBlockList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ServiceBlockV3DTO(title, content, moreAction, travelBadgesList, price, changeServiceButton, nextOptionBenefitDescription, nextOptionPrice, additionalInfoList, copyBlockList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceBlockV3DTO)) {
            return false;
        }
        ServiceBlockV3DTO serviceBlockV3DTO = (ServiceBlockV3DTO) other;
        return Intrinsics.d(this.title, serviceBlockV3DTO.title) && Intrinsics.d(this.content, serviceBlockV3DTO.content) && Intrinsics.d(this.moreAction, serviceBlockV3DTO.moreAction) && Intrinsics.d(this.travelBadgesList, serviceBlockV3DTO.travelBadgesList) && Intrinsics.d(this.price, serviceBlockV3DTO.price) && Intrinsics.d(this.changeServiceButton, serviceBlockV3DTO.changeServiceButton) && Intrinsics.d(this.nextOptionBenefitDescription, serviceBlockV3DTO.nextOptionBenefitDescription) && Intrinsics.d(this.nextOptionPrice, serviceBlockV3DTO.nextOptionPrice) && Intrinsics.d(this.additionalInfoList, serviceBlockV3DTO.additionalInfoList) && Intrinsics.d(this.copyBlockList, serviceBlockV3DTO.copyBlockList);
    }

    public final List<AdditionalInfo> getAdditionalInfoList() {
        return this.additionalInfoList;
    }

    public final ButtonV3Atom.SmallButton getChangeServiceButton() {
        return this.changeServiceButton;
    }

    @NotNull
    public final TextAtom getContent() {
        return this.content;
    }

    public final List<CopyBlock> getCopyBlockList() {
        return this.copyBlockList;
    }

    public final LinkButtonDTO getMoreAction() {
        return this.moreAction;
    }

    public final TextAtom getNextOptionBenefitDescription() {
        return this.nextOptionBenefitDescription;
    }

    public final Price getNextOptionPrice() {
        return this.nextOptionPrice;
    }

    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final List<TravelBadgeDTO> getTravelBadgesList() {
        return this.travelBadgesList;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.content);
        LinkButtonDTO linkButtonDTO = this.moreAction;
        int hashCode = (b11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31;
        List<TravelBadgeDTO> list = this.travelBadgesList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Price price = this.price;
        int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.changeServiceButton;
        int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        TextAtom textAtom = this.nextOptionBenefitDescription;
        int hashCode5 = (hashCode4 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Price price2 = this.nextOptionPrice;
        int hashCode6 = (hashCode5 + (price2 == null ? 0 : price2.hashCode())) * 31;
        List<AdditionalInfo> list2 = this.additionalInfoList;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CopyBlock> list3 = this.copyBlockList;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.content;
        LinkButtonDTO linkButtonDTO = this.moreAction;
        List<TravelBadgeDTO> list = this.travelBadgesList;
        Price price = this.price;
        ButtonV3Atom.SmallButton smallButton = this.changeServiceButton;
        TextAtom textAtom3 = this.nextOptionBenefitDescription;
        Price price2 = this.nextOptionPrice;
        List<AdditionalInfo> list2 = this.additionalInfoList;
        List<CopyBlock> list3 = this.copyBlockList;
        StringBuilder a11 = a.a("ServiceBlockV3DTO(title=", textAtom, ", content=", textAtom2, ", moreAction=");
        a11.append(linkButtonDTO);
        a11.append(", travelBadgesList=");
        a11.append(list);
        a11.append(", price=");
        a11.append(price);
        a11.append(", changeServiceButton=");
        a11.append(smallButton);
        a11.append(", nextOptionBenefitDescription=");
        a11.append(textAtom3);
        a11.append(", nextOptionPrice=");
        a11.append(price2);
        a11.append(", additionalInfoList=");
        a11.append(list2);
        a11.append(", copyBlockList=");
        a11.append(list3);
        a11.append(")");
        return a11.toString();
    }
}
