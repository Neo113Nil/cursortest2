package ru.ozon.app.android.returns.details.data.dto;

import HY.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.returns.details.data.dto.ReturnDetailsDto;
import ru.ozon.app.android.returns.details.data.dto.controls.RmsAspectDto;
import ru.ozon.app.android.returns.details.data.dto.controls.RmsSelectDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto;", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "description", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "<init>", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "getDescription", "()Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Description", "TimeSlotSelector", "TimeSlotDto", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnMethodDto implements ReturnDetailsDto.Component {
    public static final int $stable = 8;

    @NotNull
    private final Description description;
    private final DisclaimerAtom disclaimer;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$Description;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "timeSlotSelector", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "link", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "infoFields", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getTimeSlotSelector", "()Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "getLink", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getInfoFields", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Description {
        public static final int $stable = 8;

        @NotNull
        private final BadgeDTO badge;
        private final List<BadgeDTO> infoFields;
        private final ButtonV3Atom.SmallBorderlessButton link;
        private final TextAtom subtitle;
        private final TimeSlotSelector timeSlotSelector;

        @NotNull
        private final TextAtom title;

        public Description(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") TextAtom textAtom, @i(name = "timeSlotSelector") TimeSlotSelector timeSlotSelector, @i(name = "link") ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, @i(name = "infoFields") List<BadgeDTO> list, @i(name = "badge") @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.title = title;
            this.subtitle = textAtom;
            this.timeSlotSelector = timeSlotSelector;
            this.link = smallBorderlessButton;
            this.infoFields = list;
            this.badge = badge;
        }

        public static /* synthetic */ Description copy$default(Description description, TextAtom textAtom, TextAtom textAtom2, TimeSlotSelector timeSlotSelector, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = description.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = description.subtitle;
            }
            if ((i11 & 4) != 0) {
                timeSlotSelector = description.timeSlotSelector;
            }
            if ((i11 & 8) != 0) {
                smallBorderlessButton = description.link;
            }
            if ((i11 & 16) != 0) {
                list = description.infoFields;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = description.badge;
            }
            List list2 = list;
            BadgeDTO badgeDTO2 = badgeDTO;
            return description.copy(textAtom, textAtom2, timeSlotSelector, smallBorderlessButton, list2, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final TimeSlotSelector getTimeSlotSelector() {
            return this.timeSlotSelector;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getLink() {
            return this.link;
        }

        public final List<BadgeDTO> component5() {
            return this.infoFields;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final Description copy(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") TextAtom subtitle, @i(name = "timeSlotSelector") TimeSlotSelector timeSlotSelector, @i(name = "link") ButtonV3Atom.SmallBorderlessButton link, @i(name = "infoFields") List<BadgeDTO> infoFields, @i(name = "badge") @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new Description(title, subtitle, timeSlotSelector, link, infoFields, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Description)) {
                return false;
            }
            Description description = (Description) other;
            return Intrinsics.d(this.title, description.title) && Intrinsics.d(this.subtitle, description.subtitle) && Intrinsics.d(this.timeSlotSelector, description.timeSlotSelector) && Intrinsics.d(this.link, description.link) && Intrinsics.d(this.infoFields, description.infoFields) && Intrinsics.d(this.badge, description.badge);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<BadgeDTO> getInfoFields() {
            return this.infoFields;
        }

        public final ButtonV3Atom.SmallBorderlessButton getLink() {
            return this.link;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TimeSlotSelector getTimeSlotSelector() {
            return this.timeSlotSelector;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TimeSlotSelector timeSlotSelector = this.timeSlotSelector;
            int hashCode3 = (hashCode2 + (timeSlotSelector == null ? 0 : timeSlotSelector.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.link;
            int hashCode4 = (hashCode3 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
            List<BadgeDTO> list = this.infoFields;
            return this.badge.hashCode() + ((hashCode4 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            TimeSlotSelector timeSlotSelector = this.timeSlotSelector;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.link;
            List<BadgeDTO> list = this.infoFields;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder a11 = a.a("Description(title=", textAtom, ", subtitle=", textAtom2, ", timeSlotSelector=");
            a11.append(timeSlotSelector);
            a11.append(", link=");
            a11.append(smallBorderlessButton);
            a11.append(", infoFields=");
            a11.append(list);
            a11.append(", badge=");
            a11.append(badgeDTO);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "", "day", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;", "timeInterval", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "<init>", "(Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;)V", "getDay", "()Lru/ozon/app/android/returns/details/data/dto/controls/RmsAspectDto;", "getTimeInterval", "()Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeSlotDto {
        public static final int $stable = 8;

        @NotNull
        private final RmsAspectDto day;

        @NotNull
        private final RmsSelectDto timeInterval;

        public TimeSlotDto(@i(name = "day") @NotNull RmsAspectDto day, @i(name = "timeInterval") @NotNull RmsSelectDto timeInterval) {
            Intrinsics.checkNotNullParameter(day, "day");
            Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
            this.day = day;
            this.timeInterval = timeInterval;
        }

        public static /* synthetic */ TimeSlotDto copy$default(TimeSlotDto timeSlotDto, RmsAspectDto rmsAspectDto, RmsSelectDto rmsSelectDto, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rmsAspectDto = timeSlotDto.day;
            }
            if ((i11 & 2) != 0) {
                rmsSelectDto = timeSlotDto.timeInterval;
            }
            return timeSlotDto.copy(rmsAspectDto, rmsSelectDto);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RmsAspectDto getDay() {
            return this.day;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RmsSelectDto getTimeInterval() {
            return this.timeInterval;
        }

        @NotNull
        public final TimeSlotDto copy(@i(name = "day") @NotNull RmsAspectDto day, @i(name = "timeInterval") @NotNull RmsSelectDto timeInterval) {
            Intrinsics.checkNotNullParameter(day, "day");
            Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
            return new TimeSlotDto(day, timeInterval);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeSlotDto)) {
                return false;
            }
            TimeSlotDto timeSlotDto = (TimeSlotDto) other;
            return Intrinsics.d(this.day, timeSlotDto.day) && Intrinsics.d(this.timeInterval, timeSlotDto.timeInterval);
        }

        @NotNull
        public final RmsAspectDto getDay() {
            return this.day;
        }

        @NotNull
        public final RmsSelectDto getTimeInterval() {
            return this.timeInterval;
        }

        public int hashCode() {
            return this.timeInterval.hashCode() + (this.day.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TimeSlotDto(day=" + this.day + ", timeInterval=" + this.timeInterval + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "", "timeSlots", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "confirm", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getTimeSlots", "()Ljava/util/List;", "getConfirm", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeSlotSelector {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3Atom.SmallButton confirm;

        @NotNull
        private final List<TimeSlotDto> timeSlots;

        public TimeSlotSelector(@i(name = "timeSlots") @NotNull List<TimeSlotDto> timeSlots, @i(name = "confirm") @NotNull ButtonV3Atom.SmallButton confirm) {
            Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
            Intrinsics.checkNotNullParameter(confirm, "confirm");
            this.timeSlots = timeSlots;
            this.confirm = confirm;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimeSlotSelector copy$default(TimeSlotSelector timeSlotSelector, List list, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = timeSlotSelector.timeSlots;
            }
            if ((i11 & 2) != 0) {
                smallButton = timeSlotSelector.confirm;
            }
            return timeSlotSelector.copy(list, smallButton);
        }

        @NotNull
        public final List<TimeSlotDto> component1() {
            return this.timeSlots;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallButton getConfirm() {
            return this.confirm;
        }

        @NotNull
        public final TimeSlotSelector copy(@i(name = "timeSlots") @NotNull List<TimeSlotDto> timeSlots, @i(name = "confirm") @NotNull ButtonV3Atom.SmallButton confirm) {
            Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
            Intrinsics.checkNotNullParameter(confirm, "confirm");
            return new TimeSlotSelector(timeSlots, confirm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeSlotSelector)) {
                return false;
            }
            TimeSlotSelector timeSlotSelector = (TimeSlotSelector) other;
            return Intrinsics.d(this.timeSlots, timeSlotSelector.timeSlots) && Intrinsics.d(this.confirm, timeSlotSelector.confirm);
        }

        @NotNull
        public final ButtonV3Atom.SmallButton getConfirm() {
            return this.confirm;
        }

        @NotNull
        public final List<TimeSlotDto> getTimeSlots() {
            return this.timeSlots;
        }

        public int hashCode() {
            return this.confirm.hashCode() + (this.timeSlots.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TimeSlotSelector(timeSlots=" + this.timeSlots + ", confirm=" + this.confirm + ")";
        }
    }

    public ReturnMethodDto(@i(name = "description") @NotNull Description description, @i(name = "disclaimer") DisclaimerAtom disclaimerAtom) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.disclaimer = disclaimerAtom;
    }

    @NotNull
    public final Description getDescription() {
        return this.description;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }
}
