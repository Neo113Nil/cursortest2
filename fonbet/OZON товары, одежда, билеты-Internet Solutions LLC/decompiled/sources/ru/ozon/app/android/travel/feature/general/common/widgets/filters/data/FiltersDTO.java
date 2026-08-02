package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import Ak.b;
import B0.C2454a;
import B90.C2618u;
import C.o0;
import G.g;
import H3.c;
import Kk.C3532b;
import Nh.a;
import T7.P;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003345Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$HeaderDTO;", "sections", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$FooterDTO;", "isFirstSectionSeparated", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "asyncBehavior", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "asyncServerErrorMessage", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "asyncErrorMessage", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$HeaderDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$FooterDTO;ZLjava/util/Map;Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$HeaderDTO;", "getSections", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$FooterDTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getAsyncBehavior", "()Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "getAsyncServerErrorMessage", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "getAsyncErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "HeaderDTO", "SectionDTO", "FooterDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersDTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final AsyncActionDTO asyncBehavior;
    private final EmptyStateV2WidgetDTO asyncErrorMessage;
    private final EmptyStateV2WidgetDTO asyncServerErrorMessage;

    @NotNull
    private final FooterDTO footer;

    @NotNull
    private final HeaderDTO header;
    private final boolean isFirstSectionSeparated;

    @NotNull
    private final List<SectionDTO> sections;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$HeaderDTO;", "", "leftButtonApp", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getLeftButtonApp", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final ButtonV3DTO leftButtonApp;
        private final IconButtonV3DTO rightButton;
        private final TextDTO title;

        public HeaderDTO(ButtonV3DTO buttonV3DTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO) {
            this.leftButtonApp = buttonV3DTO;
            this.title = textDTO;
            this.rightButton = iconButtonV3DTO;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = headerDTO.leftButtonApp;
            }
            if ((i11 & 2) != 0) {
                textDTO = headerDTO.title;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = headerDTO.rightButton;
            }
            return headerDTO.copy(buttonV3DTO, textDTO, iconButtonV3DTO);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getLeftButtonApp() {
            return this.leftButtonApp;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        @NotNull
        public final HeaderDTO copy(ButtonV3DTO leftButtonApp, TextDTO title, IconButtonV3DTO rightButton) {
            return new HeaderDTO(leftButtonApp, title, rightButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.leftButtonApp, headerDTO.leftButtonApp) && Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.rightButton, headerDTO.rightButton);
        }

        public final ButtonV3DTO getLeftButtonApp() {
            return this.leftButtonApp;
        }

        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            ButtonV3DTO buttonV3DTO = this.leftButtonApp;
            int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.rightButton;
            return hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HeaderDTO(leftButtonApp=" + this.leftButtonApp + ", title=" + this.title + ", rightButton=" + this.rightButton + ")";
        }
    }

    public FiltersDTO(@NotNull HeaderDTO header, @NotNull List<SectionDTO> sections, @NotNull FooterDTO footer, boolean z11, Map<String, TokenizedTrackingInfo> map, AsyncActionDTO asyncActionDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.header = header;
        this.sections = sections;
        this.footer = footer;
        this.isFirstSectionSeparated = z11;
        this.trackingInfo = map;
        this.asyncBehavior = asyncActionDTO;
        this.asyncServerErrorMessage = emptyStateV2WidgetDTO;
        this.asyncErrorMessage = emptyStateV2WidgetDTO2;
    }

    public static /* synthetic */ FiltersDTO copy$default(FiltersDTO filtersDTO, HeaderDTO headerDTO, List list, FooterDTO footerDTO, boolean z11, Map map, AsyncActionDTO asyncActionDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = filtersDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = filtersDTO.sections;
        }
        if ((i11 & 4) != 0) {
            footerDTO = filtersDTO.footer;
        }
        if ((i11 & 8) != 0) {
            z11 = filtersDTO.isFirstSectionSeparated;
        }
        if ((i11 & 16) != 0) {
            map = filtersDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            asyncActionDTO = filtersDTO.asyncBehavior;
        }
        if ((i11 & 64) != 0) {
            emptyStateV2WidgetDTO = filtersDTO.asyncServerErrorMessage;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            emptyStateV2WidgetDTO2 = filtersDTO.asyncErrorMessage;
        }
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO3 = emptyStateV2WidgetDTO;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO4 = emptyStateV2WidgetDTO2;
        Map map2 = map;
        AsyncActionDTO asyncActionDTO2 = asyncActionDTO;
        return filtersDTO.copy(headerDTO, list, footerDTO, z11, map2, asyncActionDTO2, emptyStateV2WidgetDTO3, emptyStateV2WidgetDTO4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SectionDTO> component2() {
        return this.sections;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFirstSectionSeparated() {
        return this.isFirstSectionSeparated;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    /* renamed from: component7, reason: from getter */
    public final EmptyStateV2WidgetDTO getAsyncServerErrorMessage() {
        return this.asyncServerErrorMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final EmptyStateV2WidgetDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    @NotNull
    public final FiltersDTO copy(@NotNull HeaderDTO header, @NotNull List<SectionDTO> sections, @NotNull FooterDTO footer, boolean isFirstSectionSeparated, Map<String, TokenizedTrackingInfo> trackingInfo, AsyncActionDTO asyncBehavior, EmptyStateV2WidgetDTO asyncServerErrorMessage, EmptyStateV2WidgetDTO asyncErrorMessage) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new FiltersDTO(header, sections, footer, isFirstSectionSeparated, trackingInfo, asyncBehavior, asyncServerErrorMessage, asyncErrorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersDTO)) {
            return false;
        }
        FiltersDTO filtersDTO = (FiltersDTO) other;
        return Intrinsics.d(this.header, filtersDTO.header) && Intrinsics.d(this.sections, filtersDTO.sections) && Intrinsics.d(this.footer, filtersDTO.footer) && this.isFirstSectionSeparated == filtersDTO.isFirstSectionSeparated && Intrinsics.d(this.trackingInfo, filtersDTO.trackingInfo) && Intrinsics.d(this.asyncBehavior, filtersDTO.asyncBehavior) && Intrinsics.d(this.asyncServerErrorMessage, filtersDTO.asyncServerErrorMessage) && Intrinsics.d(this.asyncErrorMessage, filtersDTO.asyncErrorMessage);
    }

    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    public final EmptyStateV2WidgetDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    public final EmptyStateV2WidgetDTO getAsyncServerErrorMessage() {
        return this.asyncServerErrorMessage;
    }

    @NotNull
    public final FooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SectionDTO> getSections() {
        return this.sections;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.footer.hashCode() + g.b(this.header.hashCode() * 31, 31, this.sections)) * 31, 31, this.isFirstSectionSeparated);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        int hashCode2 = (hashCode + (asyncActionDTO == null ? 0 : asyncActionDTO.hashCode())) * 31;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO = this.asyncServerErrorMessage;
        int hashCode3 = (hashCode2 + (emptyStateV2WidgetDTO == null ? 0 : emptyStateV2WidgetDTO.hashCode())) * 31;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2 = this.asyncErrorMessage;
        return hashCode3 + (emptyStateV2WidgetDTO2 != null ? emptyStateV2WidgetDTO2.hashCode() : 0);
    }

    public final boolean isFirstSectionSeparated() {
        return this.isFirstSectionSeparated;
    }

    @NotNull
    public String toString() {
        return "FiltersDTO(header=" + this.header + ", sections=" + this.sections + ", footer=" + this.footer + ", isFirstSectionSeparated=" + this.isFirstSectionSeparated + ", trackingInfo=" + this.trackingInfo + ", asyncBehavior=" + this.asyncBehavior + ", asyncServerErrorMessage=" + this.asyncServerErrorMessage + ", asyncErrorMessage=" + this.asyncErrorMessage + ")";
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\b\"#$%&'()BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "control", "component", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getControl", "()Ljava/lang/Object;", "getComponent", "getTrackingInfo", "()Ljava/util/Map;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ToggleControlDTO", "OpenRangeFilterDTO", "TagsFilterDTO", "CellListFilterDTO", "CustomizableCellListFilterDTO", "CustomizableCell", "TagsWithTitleFilterDTO", "SliderWithLabelsFilterDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SectionDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final Object component;
        private final Object control;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CellListFilterDTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getCells", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final class CellListFilterDTO {

            @NotNull
            private final List<CellDTO> cells;

            private /* synthetic */ CellListFilterDTO(List list) {
                this.cells = list;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ CellListFilterDTO m1209boximpl(List list) {
                return new CellListFilterDTO(list);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends CellDTO> m1210constructorimpl(@NotNull List<CellDTO> cells) {
                Intrinsics.checkNotNullParameter(cells, "cells");
                return cells;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1211equalsimpl(List<? extends CellDTO> list, Object obj) {
                return (obj instanceof CellListFilterDTO) && Intrinsics.d(list, ((CellListFilterDTO) obj).getCells());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1212equalsimpl0(List<? extends CellDTO> list, List<? extends CellDTO> list2) {
                return Intrinsics.d(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1213hashCodeimpl(List<? extends CellDTO> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1214toStringimpl(List<? extends CellDTO> list) {
                return c.a("CellListFilterDTO(cells=", ")", list);
            }

            public boolean equals(Object obj) {
                return m1211equalsimpl(this.cells, obj);
            }

            @NotNull
            public final List<CellDTO> getCells() {
                return this.cells;
            }

            public int hashCode() {
                return m1213hashCodeimpl(this.cells);
            }

            public String toString() {
                return m1214toStringimpl(this.cells);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getCells() {
                return this.cells;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCellListFilterDTO;", "", "customizableCells", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCell;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getCustomizableCells", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final class CustomizableCellListFilterDTO {

            @NotNull
            private final List<CustomizableCell> customizableCells;

            private /* synthetic */ CustomizableCellListFilterDTO(List list) {
                this.customizableCells = list;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ CustomizableCellListFilterDTO m1216boximpl(List list) {
                return new CustomizableCellListFilterDTO(list);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends CustomizableCell> m1217constructorimpl(@NotNull List<CustomizableCell> customizableCells) {
                Intrinsics.checkNotNullParameter(customizableCells, "customizableCells");
                return customizableCells;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1218equalsimpl(List<? extends CustomizableCell> list, Object obj) {
                return (obj instanceof CustomizableCellListFilterDTO) && Intrinsics.d(list, ((CustomizableCellListFilterDTO) obj).getCustomizableCells());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1219equalsimpl0(List<? extends CustomizableCell> list, List<? extends CustomizableCell> list2) {
                return Intrinsics.d(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1220hashCodeimpl(List<? extends CustomizableCell> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1221toStringimpl(List<? extends CustomizableCell> list) {
                return c.a("CustomizableCellListFilterDTO(customizableCells=", ")", list);
            }

            public boolean equals(Object obj) {
                return m1218equalsimpl(this.customizableCells, obj);
            }

            @NotNull
            public final List<CustomizableCell> getCustomizableCells() {
                return this.customizableCells;
            }

            public int hashCode() {
                return m1220hashCodeimpl(this.customizableCells);
            }

            public String toString() {
                return m1221toStringimpl(this.customizableCells);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getCustomizableCells() {
                return this.customizableCells;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO;", "", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "thereInputs", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO$SliderWithLabelsControlDTO;", "backInputs", "<init>", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;Ljava/util/List;Ljava/util/List;)V", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getThereInputs", "()Ljava/util/List;", "getBackInputs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SliderWithLabelsControlDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SliderWithLabelsFilterDTO {
            public static final int $stable = 8;
            private final List<SliderWithLabelsControlDTO> backInputs;
            private final TabsDTO tabs;

            @NotNull
            private final List<SliderWithLabelsControlDTO> thereInputs;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO$SliderWithLabelsControlDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "badgeTextTemplate", "", "badgeTextMask", "sliderWithLabels", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getBadgeTextTemplate", "()Ljava/lang/String;", "getBadgeTextMask", "getSliderWithLabels", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SliderWithLabelsControlDTO {
                public static final int $stable = 8;

                @NotNull
                private final TagButtonDTO badge;
                private final String badgeTextMask;

                @NotNull
                private final String badgeTextTemplate;
                private final CommonControlSettings common;

                @NotNull
                private final SliderWithLabelsDTO sliderWithLabels;

                @NotNull
                private final TextDTO title;

                public SliderWithLabelsControlDTO(@NotNull TextDTO title, @NotNull TagButtonDTO badge, @NotNull String badgeTextTemplate, String str, @NotNull SliderWithLabelsDTO sliderWithLabels, CommonControlSettings commonControlSettings) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(badge, "badge");
                    Intrinsics.checkNotNullParameter(badgeTextTemplate, "badgeTextTemplate");
                    Intrinsics.checkNotNullParameter(sliderWithLabels, "sliderWithLabels");
                    this.title = title;
                    this.badge = badge;
                    this.badgeTextTemplate = badgeTextTemplate;
                    this.badgeTextMask = str;
                    this.sliderWithLabels = sliderWithLabels;
                    this.common = commonControlSettings;
                }

                public static /* synthetic */ SliderWithLabelsControlDTO copy$default(SliderWithLabelsControlDTO sliderWithLabelsControlDTO, TextDTO textDTO, TagButtonDTO tagButtonDTO, String str, String str2, SliderWithLabelsDTO sliderWithLabelsDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = sliderWithLabelsControlDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        tagButtonDTO = sliderWithLabelsControlDTO.badge;
                    }
                    if ((i11 & 4) != 0) {
                        str = sliderWithLabelsControlDTO.badgeTextTemplate;
                    }
                    if ((i11 & 8) != 0) {
                        str2 = sliderWithLabelsControlDTO.badgeTextMask;
                    }
                    if ((i11 & 16) != 0) {
                        sliderWithLabelsDTO = sliderWithLabelsControlDTO.sliderWithLabels;
                    }
                    if ((i11 & 32) != 0) {
                        commonControlSettings = sliderWithLabelsControlDTO.common;
                    }
                    SliderWithLabelsDTO sliderWithLabelsDTO2 = sliderWithLabelsDTO;
                    CommonControlSettings commonControlSettings2 = commonControlSettings;
                    return sliderWithLabelsControlDTO.copy(textDTO, tagButtonDTO, str, str2, sliderWithLabelsDTO2, commonControlSettings2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TagButtonDTO getBadge() {
                    return this.badge;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getBadgeTextTemplate() {
                    return this.badgeTextTemplate;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBadgeTextMask() {
                    return this.badgeTextMask;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final SliderWithLabelsDTO getSliderWithLabels() {
                    return this.sliderWithLabels;
                }

                /* renamed from: component6, reason: from getter */
                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                @NotNull
                public final SliderWithLabelsControlDTO copy(@NotNull TextDTO title, @NotNull TagButtonDTO badge, @NotNull String badgeTextTemplate, String badgeTextMask, @NotNull SliderWithLabelsDTO sliderWithLabels, CommonControlSettings common) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(badge, "badge");
                    Intrinsics.checkNotNullParameter(badgeTextTemplate, "badgeTextTemplate");
                    Intrinsics.checkNotNullParameter(sliderWithLabels, "sliderWithLabels");
                    return new SliderWithLabelsControlDTO(title, badge, badgeTextTemplate, badgeTextMask, sliderWithLabels, common);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SliderWithLabelsControlDTO)) {
                        return false;
                    }
                    SliderWithLabelsControlDTO sliderWithLabelsControlDTO = (SliderWithLabelsControlDTO) other;
                    return Intrinsics.d(this.title, sliderWithLabelsControlDTO.title) && Intrinsics.d(this.badge, sliderWithLabelsControlDTO.badge) && Intrinsics.d(this.badgeTextTemplate, sliderWithLabelsControlDTO.badgeTextTemplate) && Intrinsics.d(this.badgeTextMask, sliderWithLabelsControlDTO.badgeTextMask) && Intrinsics.d(this.sliderWithLabels, sliderWithLabelsControlDTO.sliderWithLabels) && Intrinsics.d(this.common, sliderWithLabelsControlDTO.common);
                }

                @NotNull
                public final TagButtonDTO getBadge() {
                    return this.badge;
                }

                public final String getBadgeTextMask() {
                    return this.badgeTextMask;
                }

                @NotNull
                public final String getBadgeTextTemplate() {
                    return this.badgeTextTemplate;
                }

                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                @NotNull
                public final SliderWithLabelsDTO getSliderWithLabels() {
                    return this.sliderWithLabels;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int a11 = g.a((this.badge.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.badgeTextTemplate);
                    String str = this.badgeTextMask;
                    int hashCode = (this.sliderWithLabels.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                    CommonControlSettings commonControlSettings = this.common;
                    return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TagButtonDTO tagButtonDTO = this.badge;
                    String str = this.badgeTextTemplate;
                    String str2 = this.badgeTextMask;
                    SliderWithLabelsDTO sliderWithLabelsDTO = this.sliderWithLabels;
                    CommonControlSettings commonControlSettings = this.common;
                    StringBuilder sb2 = new StringBuilder("SliderWithLabelsControlDTO(title=");
                    sb2.append(textDTO);
                    sb2.append(", badge=");
                    sb2.append(tagButtonDTO);
                    sb2.append(", badgeTextTemplate=");
                    a.h(sb2, str, ", badgeTextMask=", str2, ", sliderWithLabels=");
                    sb2.append(sliderWithLabelsDTO);
                    sb2.append(", common=");
                    sb2.append(commonControlSettings);
                    sb2.append(")");
                    return sb2.toString();
                }
            }

            public SliderWithLabelsFilterDTO(TabsDTO tabsDTO, @NotNull List<SliderWithLabelsControlDTO> thereInputs, List<SliderWithLabelsControlDTO> list) {
                Intrinsics.checkNotNullParameter(thereInputs, "thereInputs");
                this.tabs = tabsDTO;
                this.thereInputs = thereInputs;
                this.backInputs = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SliderWithLabelsFilterDTO copy$default(SliderWithLabelsFilterDTO sliderWithLabelsFilterDTO, TabsDTO tabsDTO, List list, List list2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    tabsDTO = sliderWithLabelsFilterDTO.tabs;
                }
                if ((i11 & 2) != 0) {
                    list = sliderWithLabelsFilterDTO.thereInputs;
                }
                if ((i11 & 4) != 0) {
                    list2 = sliderWithLabelsFilterDTO.backInputs;
                }
                return sliderWithLabelsFilterDTO.copy(tabsDTO, list, list2);
            }

            /* renamed from: component1, reason: from getter */
            public final TabsDTO getTabs() {
                return this.tabs;
            }

            @NotNull
            public final List<SliderWithLabelsControlDTO> component2() {
                return this.thereInputs;
            }

            public final List<SliderWithLabelsControlDTO> component3() {
                return this.backInputs;
            }

            @NotNull
            public final SliderWithLabelsFilterDTO copy(TabsDTO tabs, @NotNull List<SliderWithLabelsControlDTO> thereInputs, List<SliderWithLabelsControlDTO> backInputs) {
                Intrinsics.checkNotNullParameter(thereInputs, "thereInputs");
                return new SliderWithLabelsFilterDTO(tabs, thereInputs, backInputs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SliderWithLabelsFilterDTO)) {
                    return false;
                }
                SliderWithLabelsFilterDTO sliderWithLabelsFilterDTO = (SliderWithLabelsFilterDTO) other;
                return Intrinsics.d(this.tabs, sliderWithLabelsFilterDTO.tabs) && Intrinsics.d(this.thereInputs, sliderWithLabelsFilterDTO.thereInputs) && Intrinsics.d(this.backInputs, sliderWithLabelsFilterDTO.backInputs);
            }

            public final List<SliderWithLabelsControlDTO> getBackInputs() {
                return this.backInputs;
            }

            public final TabsDTO getTabs() {
                return this.tabs;
            }

            @NotNull
            public final List<SliderWithLabelsControlDTO> getThereInputs() {
                return this.thereInputs;
            }

            public int hashCode() {
                TabsDTO tabsDTO = this.tabs;
                int b11 = g.b((tabsDTO == null ? 0 : tabsDTO.hashCode()) * 31, 31, this.thereInputs);
                List<SliderWithLabelsControlDTO> list = this.backInputs;
                return b11 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TabsDTO tabsDTO = this.tabs;
                List<SliderWithLabelsControlDTO> list = this.thereInputs;
                List<SliderWithLabelsControlDTO> list2 = this.backInputs;
                StringBuilder sb2 = new StringBuilder("SliderWithLabelsFilterDTO(tabs=");
                sb2.append(tabsDTO);
                sb2.append(", thereInputs=");
                sb2.append(list);
                sb2.append(", backInputs=");
                return C2618u.h(sb2, list2, ")");
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsFilterDTO;", "", "tags", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getTags", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final class TagsFilterDTO {

            @NotNull
            private final List<TagButtonDTO> tags;

            private /* synthetic */ TagsFilterDTO(List list) {
                this.tags = list;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ TagsFilterDTO m1223boximpl(List list) {
                return new TagsFilterDTO(list);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends TagButtonDTO> m1224constructorimpl(@NotNull List<TagButtonDTO> tags) {
                Intrinsics.checkNotNullParameter(tags, "tags");
                return tags;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1225equalsimpl(List<? extends TagButtonDTO> list, Object obj) {
                return (obj instanceof TagsFilterDTO) && Intrinsics.d(list, ((TagsFilterDTO) obj).getTags());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1226equalsimpl0(List<? extends TagButtonDTO> list, List<? extends TagButtonDTO> list2) {
                return Intrinsics.d(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1227hashCodeimpl(List<? extends TagButtonDTO> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1228toStringimpl(List<? extends TagButtonDTO> list) {
                return c.a("TagsFilterDTO(tags=", ")", list);
            }

            public boolean equals(Object obj) {
                return m1225equalsimpl(this.tags, obj);
            }

            @NotNull
            public final List<TagButtonDTO> getTags() {
                return this.tags;
            }

            public int hashCode() {
                return m1227hashCodeimpl(this.tags);
            }

            public String toString() {
                return m1228toStringimpl(this.tags);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getTags() {
                return this.tags;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO;", "", "filtersInTab", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO$TagsWithTitleSectionInTabDTO;", "filterTabs", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "getFiltersInTab", "()Ljava/util/List;", "getFilterTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TagsWithTitleSectionInTabDTO", "TagsWithTitleSectionDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TagsWithTitleFilterDTO {
            public static final int $stable = 8;
            private final TabsDTO filterTabs;

            @NotNull
            private final List<TagsWithTitleSectionInTabDTO> filtersInTab;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO$TagsWithTitleSectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tags", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TagsWithTitleSectionDTO {
                public static final int $stable = 8;

                @NotNull
                private final List<TagButtonDTO> tags;
                private final TextDTO title;

                public TagsWithTitleSectionDTO(TextDTO textDTO, @NotNull List<TagButtonDTO> tags) {
                    Intrinsics.checkNotNullParameter(tags, "tags");
                    this.title = textDTO;
                    this.tags = tags;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ TagsWithTitleSectionDTO copy$default(TagsWithTitleSectionDTO tagsWithTitleSectionDTO, TextDTO textDTO, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = tagsWithTitleSectionDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        list = tagsWithTitleSectionDTO.tags;
                    }
                    return tagsWithTitleSectionDTO.copy(textDTO, list);
                }

                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                public final List<TagButtonDTO> component2() {
                    return this.tags;
                }

                @NotNull
                public final TagsWithTitleSectionDTO copy(TextDTO title, @NotNull List<TagButtonDTO> tags) {
                    Intrinsics.checkNotNullParameter(tags, "tags");
                    return new TagsWithTitleSectionDTO(title, tags);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TagsWithTitleSectionDTO)) {
                        return false;
                    }
                    TagsWithTitleSectionDTO tagsWithTitleSectionDTO = (TagsWithTitleSectionDTO) other;
                    return Intrinsics.d(this.title, tagsWithTitleSectionDTO.title) && Intrinsics.d(this.tags, tagsWithTitleSectionDTO.tags);
                }

                @NotNull
                public final List<TagButtonDTO> getTags() {
                    return this.tags;
                }

                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    TextDTO textDTO = this.title;
                    return this.tags.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
                }

                @NotNull
                public String toString() {
                    return "TagsWithTitleSectionDTO(title=" + this.title + ", tags=" + this.tags + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO$TagsWithTitleSectionInTabDTO;", "", "filters", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO$TagsWithTitleSectionDTO;", "<init>", "(Ljava/util/List;)V", "getFilters", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TagsWithTitleSectionInTabDTO {
                public static final int $stable = 8;

                @NotNull
                private final List<TagsWithTitleSectionDTO> filters;

                public TagsWithTitleSectionInTabDTO(@NotNull List<TagsWithTitleSectionDTO> filters) {
                    Intrinsics.checkNotNullParameter(filters, "filters");
                    this.filters = filters;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ TagsWithTitleSectionInTabDTO copy$default(TagsWithTitleSectionInTabDTO tagsWithTitleSectionInTabDTO, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = tagsWithTitleSectionInTabDTO.filters;
                    }
                    return tagsWithTitleSectionInTabDTO.copy(list);
                }

                @NotNull
                public final List<TagsWithTitleSectionDTO> component1() {
                    return this.filters;
                }

                @NotNull
                public final TagsWithTitleSectionInTabDTO copy(@NotNull List<TagsWithTitleSectionDTO> filters) {
                    Intrinsics.checkNotNullParameter(filters, "filters");
                    return new TagsWithTitleSectionInTabDTO(filters);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TagsWithTitleSectionInTabDTO) && Intrinsics.d(this.filters, ((TagsWithTitleSectionInTabDTO) other).filters);
                }

                @NotNull
                public final List<TagsWithTitleSectionDTO> getFilters() {
                    return this.filters;
                }

                public int hashCode() {
                    return this.filters.hashCode();
                }

                @NotNull
                public String toString() {
                    return c.a("TagsWithTitleSectionInTabDTO(filters=", ")", this.filters);
                }
            }

            public TagsWithTitleFilterDTO(@NotNull List<TagsWithTitleSectionInTabDTO> filtersInTab, TabsDTO tabsDTO) {
                Intrinsics.checkNotNullParameter(filtersInTab, "filtersInTab");
                this.filtersInTab = filtersInTab;
                this.filterTabs = tabsDTO;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TagsWithTitleFilterDTO copy$default(TagsWithTitleFilterDTO tagsWithTitleFilterDTO, List list, TabsDTO tabsDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = tagsWithTitleFilterDTO.filtersInTab;
                }
                if ((i11 & 2) != 0) {
                    tabsDTO = tagsWithTitleFilterDTO.filterTabs;
                }
                return tagsWithTitleFilterDTO.copy(list, tabsDTO);
            }

            @NotNull
            public final List<TagsWithTitleSectionInTabDTO> component1() {
                return this.filtersInTab;
            }

            /* renamed from: component2, reason: from getter */
            public final TabsDTO getFilterTabs() {
                return this.filterTabs;
            }

            @NotNull
            public final TagsWithTitleFilterDTO copy(@NotNull List<TagsWithTitleSectionInTabDTO> filtersInTab, TabsDTO filterTabs) {
                Intrinsics.checkNotNullParameter(filtersInTab, "filtersInTab");
                return new TagsWithTitleFilterDTO(filtersInTab, filterTabs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TagsWithTitleFilterDTO)) {
                    return false;
                }
                TagsWithTitleFilterDTO tagsWithTitleFilterDTO = (TagsWithTitleFilterDTO) other;
                return Intrinsics.d(this.filtersInTab, tagsWithTitleFilterDTO.filtersInTab) && Intrinsics.d(this.filterTabs, tagsWithTitleFilterDTO.filterTabs);
            }

            public final TabsDTO getFilterTabs() {
                return this.filterTabs;
            }

            @NotNull
            public final List<TagsWithTitleSectionInTabDTO> getFiltersInTab() {
                return this.filtersInTab;
            }

            public int hashCode() {
                int hashCode = this.filtersInTab.hashCode() * 31;
                TabsDTO tabsDTO = this.filterTabs;
                return hashCode + (tabsDTO == null ? 0 : tabsDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "TagsWithTitleFilterDTO(filtersInTab=" + this.filtersInTab + ", filterTabs=" + this.filterTabs + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$ToggleControlDTO;", "", "toggle", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ToggleControlDTO {
            public static final int $stable = ToggleDTO.$stable;
            private final CommonControlSettings common;
            private final TextDTO label;

            @NotNull
            private final ToggleDTO toggle;

            public ToggleControlDTO(@NotNull ToggleDTO toggle, TextDTO textDTO, CommonControlSettings commonControlSettings) {
                Intrinsics.checkNotNullParameter(toggle, "toggle");
                this.toggle = toggle;
                this.label = textDTO;
                this.common = commonControlSettings;
            }

            public static /* synthetic */ ToggleControlDTO copy$default(ToggleControlDTO toggleControlDTO, ToggleDTO toggleDTO, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    toggleDTO = toggleControlDTO.toggle;
                }
                if ((i11 & 2) != 0) {
                    textDTO = toggleControlDTO.label;
                }
                if ((i11 & 4) != 0) {
                    commonControlSettings = toggleControlDTO.common;
                }
                return toggleControlDTO.copy(toggleDTO, textDTO, commonControlSettings);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ToggleDTO getToggle() {
                return this.toggle;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getLabel() {
                return this.label;
            }

            /* renamed from: component3, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final ToggleControlDTO copy(@NotNull ToggleDTO toggle, TextDTO label, CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(toggle, "toggle");
                return new ToggleControlDTO(toggle, label, common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToggleControlDTO)) {
                    return false;
                }
                ToggleControlDTO toggleControlDTO = (ToggleControlDTO) other;
                return Intrinsics.d(this.toggle, toggleControlDTO.toggle) && Intrinsics.d(this.label, toggleControlDTO.label) && Intrinsics.d(this.common, toggleControlDTO.common);
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            public final TextDTO getLabel() {
                return this.label;
            }

            @NotNull
            public final ToggleDTO getToggle() {
                return this.toggle;
            }

            public int hashCode() {
                int hashCode = this.toggle.hashCode() * 31;
                TextDTO textDTO = this.label;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                CommonControlSettings commonControlSettings = this.common;
                return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ToggleDTO toggleDTO = this.toggle;
                TextDTO textDTO = this.label;
                CommonControlSettings commonControlSettings = this.common;
                StringBuilder sb2 = new StringBuilder("ToggleControlDTO(toggle=");
                sb2.append(toggleDTO);
                sb2.append(", label=");
                sb2.append(textDTO);
                sb2.append(", common=");
                return b.g(sb2, commonControlSettings, ")");
            }
        }

        public SectionDTO(TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "toggle", type = ToggleControlDTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") Object obj, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "openRangeFilter", type = OpenRangeFilterDTO.class), @ProtoOneOfSignature(name = "tagsFilter", type = TagsFilterDTO.class), @ProtoOneOfSignature(name = "cellListFilter", type = CellListFilterDTO.class), @ProtoOneOfSignature(name = "tagsWithTitleFilter", type = TagsWithTitleFilterDTO.class), @ProtoOneOfSignature(name = "sliderWithLabelsFilter", type = SliderWithLabelsFilterDTO.class), @ProtoOneOfSignature(name = "customizableCellListFilter", type = CustomizableCellListFilterDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object component, Map<String, TokenizedTrackingInfo> map, String str) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.title = textDTO;
            this.control = obj;
            this.component = component;
            this.trackingInfo = map;
            this.backgroundColor = str;
        }

        public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, TextDTO textDTO, Object obj, Object obj2, Map map, String str, int i11, Object obj3) {
            if ((i11 & 1) != 0) {
                textDTO = sectionDTO.title;
            }
            if ((i11 & 2) != 0) {
                obj = sectionDTO.control;
            }
            if ((i11 & 4) != 0) {
                obj2 = sectionDTO.component;
            }
            if ((i11 & 8) != 0) {
                map = sectionDTO.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                str = sectionDTO.backgroundColor;
            }
            String str2 = str;
            Object obj4 = obj2;
            return sectionDTO.copy(textDTO, obj, obj4, map, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getControl() {
            return this.control;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Object getComponent() {
            return this.component;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final SectionDTO copy(TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "toggle", type = ToggleControlDTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @ProtoOneOf(label = "type") Object control, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "openRangeFilter", type = OpenRangeFilterDTO.class), @ProtoOneOfSignature(name = "tagsFilter", type = TagsFilterDTO.class), @ProtoOneOfSignature(name = "cellListFilter", type = CellListFilterDTO.class), @ProtoOneOfSignature(name = "tagsWithTitleFilter", type = TagsWithTitleFilterDTO.class), @ProtoOneOfSignature(name = "sliderWithLabelsFilter", type = SliderWithLabelsFilterDTO.class), @ProtoOneOfSignature(name = "customizableCellListFilter", type = CustomizableCellListFilterDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object component, Map<String, TokenizedTrackingInfo> trackingInfo, String backgroundColor) {
            Intrinsics.checkNotNullParameter(component, "component");
            return new SectionDTO(title, control, component, trackingInfo, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionDTO)) {
                return false;
            }
            SectionDTO sectionDTO = (SectionDTO) other;
            return Intrinsics.d(this.title, sectionDTO.title) && Intrinsics.d(this.control, sectionDTO.control) && Intrinsics.d(this.component, sectionDTO.component) && Intrinsics.d(this.trackingInfo, sectionDTO.trackingInfo) && Intrinsics.d(this.backgroundColor, sectionDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Object getComponent() {
            return this.component;
        }

        public final Object getControl() {
            return this.control;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            Object obj = this.control;
            int c11 = H00.a.c((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.component);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (c11 + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            Object obj = this.control;
            Object obj2 = this.component;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("SectionDTO(title=");
            sb2.append(textDTO);
            sb2.append(", control=");
            sb2.append(obj);
            sb2.append(", component=");
            sb2.append(obj2);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCell;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isToggleEnabled", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomizableCell {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO cell;
            private final boolean isToggleEnabled;

            public CustomizableCell(@NotNull CellDTO cell, boolean z11) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.cell = cell;
                this.isToggleEnabled = z11;
            }

            public static /* synthetic */ CustomizableCell copy$default(CustomizableCell customizableCell, CellDTO cellDTO, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = customizableCell.cell;
                }
                if ((i11 & 2) != 0) {
                    z11 = customizableCell.isToggleEnabled;
                }
                return customizableCell.copy(cellDTO, z11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getCell() {
                return this.cell;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsToggleEnabled() {
                return this.isToggleEnabled;
            }

            @NotNull
            public final CustomizableCell copy(@NotNull CellDTO cell, boolean isToggleEnabled) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new CustomizableCell(cell, isToggleEnabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomizableCell)) {
                    return false;
                }
                CustomizableCell customizableCell = (CustomizableCell) other;
                return Intrinsics.d(this.cell, customizableCell.cell) && this.isToggleEnabled == customizableCell.isToggleEnabled;
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isToggleEnabled) + (this.cell.hashCode() * 31);
            }

            public final boolean isToggleEnabled() {
                return this.isToggleEnabled;
            }

            @NotNull
            public String toString() {
                return "CustomizableCell(cell=" + this.cell + ", isToggleEnabled=" + this.isToggleEnabled + ")";
            }

            public /* synthetic */ CustomizableCell(CellDTO cellDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(cellDTO, (i11 & 2) != 0 ? true : z11);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003Jß\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u0010?\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0007HÖ\u0001J\t\u0010B\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "minValue", "", "maxValue", "fromValue", "toValue", "hideSeparator", "", "symbol", "", "maxValueSign", "stepPower", "step", "minFieldTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "maxFieldTrackingInfo", "minSliderTrackingInfo", "maxSliderTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;IIIIZLjava/lang/String;Ljava/lang/String;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMinValue", "()I", "getMaxValue", "getFromValue", "getToValue", "getHideSeparator", "()Z", "getSymbol", "()Ljava/lang/String;", "getMaxValueSign", "getStepPower", "getStep", "getMinFieldTrackingInfo", "()Ljava/util/Map;", "getMaxFieldTrackingInfo", "getMinSliderTrackingInfo", "getMaxSliderTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OpenRangeFilterDTO {
            public static final int $stable = 8;
            private final CommonControlSettings common;
            private final int fromValue;
            private final boolean hideSeparator;
            private final Map<String, TokenizedTrackingInfo> maxFieldTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> maxSliderTrackingInfo;
            private final int maxValue;
            private final String maxValueSign;
            private final Map<String, TokenizedTrackingInfo> minFieldTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> minSliderTrackingInfo;
            private final int minValue;
            private final int step;
            private final int stepPower;
            private final String symbol;
            private final TextDTO title;
            private final int toValue;

            public OpenRangeFilterDTO(TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, int i12, int i13, int i14, boolean z11, String str, String str2, int i15, int i16, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4) {
                this.title = textDTO;
                this.common = commonControlSettings;
                this.minValue = i11;
                this.maxValue = i12;
                this.fromValue = i13;
                this.toValue = i14;
                this.hideSeparator = z11;
                this.symbol = str;
                this.maxValueSign = str2;
                this.stepPower = i15;
                this.step = i16;
                this.minFieldTrackingInfo = map;
                this.maxFieldTrackingInfo = map2;
                this.minSliderTrackingInfo = map3;
                this.maxSliderTrackingInfo = map4;
            }

            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component10, reason: from getter */
            public final int getStepPower() {
                return this.stepPower;
            }

            /* renamed from: component11, reason: from getter */
            public final int getStep() {
                return this.step;
            }

            public final Map<String, TokenizedTrackingInfo> component12() {
                return this.minFieldTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component13() {
                return this.maxFieldTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component14() {
                return this.minSliderTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component15() {
                return this.maxSliderTrackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            /* renamed from: component3, reason: from getter */
            public final int getMinValue() {
                return this.minValue;
            }

            /* renamed from: component4, reason: from getter */
            public final int getMaxValue() {
                return this.maxValue;
            }

            /* renamed from: component5, reason: from getter */
            public final int getFromValue() {
                return this.fromValue;
            }

            /* renamed from: component6, reason: from getter */
            public final int getToValue() {
                return this.toValue;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component8, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component9, reason: from getter */
            public final String getMaxValueSign() {
                return this.maxValueSign;
            }

            @NotNull
            public final OpenRangeFilterDTO copy(TextDTO title, CommonControlSettings common, int minValue, int maxValue, int fromValue, int toValue, boolean hideSeparator, String symbol, String maxValueSign, int stepPower, int step, Map<String, TokenizedTrackingInfo> minFieldTrackingInfo, Map<String, TokenizedTrackingInfo> maxFieldTrackingInfo, Map<String, TokenizedTrackingInfo> minSliderTrackingInfo, Map<String, TokenizedTrackingInfo> maxSliderTrackingInfo) {
                return new OpenRangeFilterDTO(title, common, minValue, maxValue, fromValue, toValue, hideSeparator, symbol, maxValueSign, stepPower, step, minFieldTrackingInfo, maxFieldTrackingInfo, minSliderTrackingInfo, maxSliderTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenRangeFilterDTO)) {
                    return false;
                }
                OpenRangeFilterDTO openRangeFilterDTO = (OpenRangeFilterDTO) other;
                return Intrinsics.d(this.title, openRangeFilterDTO.title) && Intrinsics.d(this.common, openRangeFilterDTO.common) && this.minValue == openRangeFilterDTO.minValue && this.maxValue == openRangeFilterDTO.maxValue && this.fromValue == openRangeFilterDTO.fromValue && this.toValue == openRangeFilterDTO.toValue && this.hideSeparator == openRangeFilterDTO.hideSeparator && Intrinsics.d(this.symbol, openRangeFilterDTO.symbol) && Intrinsics.d(this.maxValueSign, openRangeFilterDTO.maxValueSign) && this.stepPower == openRangeFilterDTO.stepPower && this.step == openRangeFilterDTO.step && Intrinsics.d(this.minFieldTrackingInfo, openRangeFilterDTO.minFieldTrackingInfo) && Intrinsics.d(this.maxFieldTrackingInfo, openRangeFilterDTO.maxFieldTrackingInfo) && Intrinsics.d(this.minSliderTrackingInfo, openRangeFilterDTO.minSliderTrackingInfo) && Intrinsics.d(this.maxSliderTrackingInfo, openRangeFilterDTO.maxSliderTrackingInfo);
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            public final int getFromValue() {
                return this.fromValue;
            }

            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final Map<String, TokenizedTrackingInfo> getMaxFieldTrackingInfo() {
                return this.maxFieldTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getMaxSliderTrackingInfo() {
                return this.maxSliderTrackingInfo;
            }

            public final int getMaxValue() {
                return this.maxValue;
            }

            public final String getMaxValueSign() {
                return this.maxValueSign;
            }

            public final Map<String, TokenizedTrackingInfo> getMinFieldTrackingInfo() {
                return this.minFieldTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getMinSliderTrackingInfo() {
                return this.minSliderTrackingInfo;
            }

            public final int getMinValue() {
                return this.minValue;
            }

            public final int getStep() {
                return this.step;
            }

            public final int getStepPower() {
                return this.stepPower;
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public final int getToValue() {
                return this.toValue;
            }

            public int hashCode() {
                TextDTO textDTO = this.title;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                CommonControlSettings commonControlSettings = this.common;
                int a11 = C3532b.a(C2454a.a(this.toValue, C2454a.a(this.fromValue, C2454a.a(this.maxValue, C2454a.a(this.minValue, (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31), 31), 31), 31), 31, this.hideSeparator);
                String str = this.symbol;
                int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.maxValueSign;
                int a12 = C2454a.a(this.step, C2454a.a(this.stepPower, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
                Map<String, TokenizedTrackingInfo> map = this.minFieldTrackingInfo;
                int hashCode3 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.maxFieldTrackingInfo;
                int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map3 = this.minSliderTrackingInfo;
                int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map4 = this.maxSliderTrackingInfo;
                return hashCode5 + (map4 != null ? map4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                CommonControlSettings commonControlSettings = this.common;
                int i11 = this.minValue;
                int i12 = this.maxValue;
                int i13 = this.fromValue;
                int i14 = this.toValue;
                boolean z11 = this.hideSeparator;
                String str = this.symbol;
                String str2 = this.maxValueSign;
                int i15 = this.stepPower;
                int i16 = this.step;
                Map<String, TokenizedTrackingInfo> map = this.minFieldTrackingInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.maxFieldTrackingInfo;
                Map<String, TokenizedTrackingInfo> map3 = this.minSliderTrackingInfo;
                Map<String, TokenizedTrackingInfo> map4 = this.maxSliderTrackingInfo;
                StringBuilder sb2 = new StringBuilder("OpenRangeFilterDTO(title=");
                sb2.append(textDTO);
                sb2.append(", common=");
                sb2.append(commonControlSettings);
                sb2.append(", minValue=");
                Ek.a.f(i11, i12, ", maxValue=", ", fromValue=", sb2);
                Ek.a.f(i13, i14, ", toValue=", ", hideSeparator=", sb2);
                C5766e.a(", symbol=", str, ", maxValueSign=", sb2, z11);
                Pk0.g.d(i15, str2, ", stepPower=", ", step=", sb2);
                sb2.append(i16);
                sb2.append(", minFieldTrackingInfo=");
                sb2.append(map);
                sb2.append(", maxFieldTrackingInfo=");
                Tl.b.g(sb2, map2, ", minSliderTrackingInfo=", map3, ", maxSliderTrackingInfo=");
                return P.f(sb2, map4, ")");
            }

            public /* synthetic */ OpenRangeFilterDTO(TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, int i12, int i13, int i14, boolean z11, String str, String str2, int i15, int i16, Map map, Map map2, Map map3, Map map4, int i17, DefaultConstructorMarker defaultConstructorMarker) {
                this(textDTO, commonControlSettings, i11, i12, (i17 & 16) != 0 ? i11 : i13, (i17 & 32) != 0 ? i12 : i14, (i17 & 64) != 0 ? false : z11, str, str2, (i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 1 : i15, (i17 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? -1 : i16, map, map2, map3, map4);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$FooterDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonsMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getButtons", "()Ljava/util/List;", "getButtonsMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterDTO {
        public static final int $stable = 8;
        private final List<ButtonV3DTO> buttons;

        @EnumNullFallback
        @NotNull
        private final Paddings buttonsMargin;

        public FooterDTO(List<ButtonV3DTO> list, @NotNull Paddings buttonsMargin) {
            Intrinsics.checkNotNullParameter(buttonsMargin, "buttonsMargin");
            this.buttons = list;
            this.buttonsMargin = buttonsMargin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FooterDTO copy$default(FooterDTO footerDTO, List list, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = footerDTO.buttons;
            }
            if ((i11 & 2) != 0) {
                paddings = footerDTO.buttonsMargin;
            }
            return footerDTO.copy(list, paddings);
        }

        public final List<ButtonV3DTO> component1() {
            return this.buttons;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getButtonsMargin() {
            return this.buttonsMargin;
        }

        @NotNull
        public final FooterDTO copy(List<ButtonV3DTO> buttons, @NotNull Paddings buttonsMargin) {
            Intrinsics.checkNotNullParameter(buttonsMargin, "buttonsMargin");
            return new FooterDTO(buttons, buttonsMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDTO)) {
                return false;
            }
            FooterDTO footerDTO = (FooterDTO) other;
            return Intrinsics.d(this.buttons, footerDTO.buttons) && this.buttonsMargin == footerDTO.buttonsMargin;
        }

        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final Paddings getButtonsMargin() {
            return this.buttonsMargin;
        }

        public int hashCode() {
            List<ButtonV3DTO> list = this.buttons;
            return this.buttonsMargin.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "FooterDTO(buttons=" + this.buttons + ", buttonsMargin=" + this.buttonsMargin + ")";
        }

        public /* synthetic */ FooterDTO(List list, Paddings paddings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? Paddings.PADDING_400 : paddings);
        }
    }

    public FiltersDTO(HeaderDTO headerDTO, List list, FooterDTO footerDTO, boolean z11, Map map, AsyncActionDTO asyncActionDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerDTO, (i11 & 2) != 0 ? K.f71697a : list, footerDTO, (i11 & 8) != 0 ? false : z11, map, asyncActionDTO, emptyStateV2WidgetDTO, emptyStateV2WidgetDTO2);
    }
}
