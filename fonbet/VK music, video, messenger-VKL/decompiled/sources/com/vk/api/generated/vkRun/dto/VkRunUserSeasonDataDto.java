package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunUserSeasonDataDto.kt */
/* loaded from: classes15.dex */
public final class VkRunUserSeasonDataDto implements Parcelable {
    public static final Parcelable.Creator<VkRunUserSeasonDataDto> CREATOR = new a();

    @pmi0("boost")
    private final Integer boost;

    @pmi0("box_counters")
    private final VkRunSeasonBoxCountersDto boxCounters;

    @pmi0("can_buy_boost")
    private final Boolean canBuyBoost;

    @pmi0("collected_products_total")
    private final Integer collectedProductsTotal;

    @pmi0("collected_tickets_total")
    private final Integer collectedTicketsTotal;

    @pmi0("cover_image")
    private final VkRunImageUrlsDto coverImage;

    @pmi0("description")
    private final String description;

    @pmi0("has_golden_pass")
    private final Boolean hasGoldenPass;

    @pmi0("has_undread_internal_notifications")
    private final Boolean hasUndreadInternalNotifications;

    @pmi0("id")
    private final int id;

    @pmi0("is_winner")
    private final boolean isWinner;

    @pmi0("level_items")
    private final List<VkRunUserSeasonLevelItemDto> levelItems;

    @pmi0("milestone_items")
    private final List<VkRunSeasonMilestoneItemDto> milestoneItems;

    @pmi0("onboarding_image")
    private final VkRunImageUrlsDto onboardingImage;

    @pmi0("open_all_boxes_status")
    private final OpenAllBoxesStatusDto openAllBoxesStatus;

    @pmi0("opened_boxes_count")
    private final Integer openedBoxesCount;

    @pmi0("period")
    private final VkRunDatePeriodDto period;

    @pmi0("preview_image")
    private final VkRunImageUrlsDto previewImage;

    @pmi0("prizes")
    private final List<VkRunSeasonPrizeDto> prizes;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final VkRunUserSeasonProgressInfoDto progress;

    @pmi0("square_image")
    private final VkRunImageUrlsDto squareImage;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("tasks")
    private final List<VkRunSeasonTaskDto> tasks;

    @pmi0("title")
    private final String title;

    @pmi0("user_prizes")
    private final List<VkRunSeasonUserPrizeDto> userPrizes;

    @pmi0("vkpay_allowed")
    private final boolean vkpayAllowed;

    @pmi0("waiting_for_result_period_length")
    private final int waitingForResultPeriodLength;

    @pmi0("winners_list_url")
    private final String winnersListUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunUserSeasonDataDto.kt */
    public static final class OpenAllBoxesStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpenAllBoxesStatusDto[] $VALUES;
        public static final Parcelable.Creator<OpenAllBoxesStatusDto> CREATOR;

        @pmi0("finished")
        public static final OpenAllBoxesStatusDto FINISHED;

        @pmi0("none")
        public static final OpenAllBoxesStatusDto NONE;
        private final String value;

        /* compiled from: VkRunUserSeasonDataDto.kt */
        public static final class a implements Parcelable.Creator<OpenAllBoxesStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final OpenAllBoxesStatusDto createFromParcel(Parcel parcel) {
                return OpenAllBoxesStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAllBoxesStatusDto[] newArray(int i) {
                return new OpenAllBoxesStatusDto[i];
            }
        }

        static {
            OpenAllBoxesStatusDto openAllBoxesStatusDto = new OpenAllBoxesStatusDto("NONE", 0, "none");
            NONE = openAllBoxesStatusDto;
            OpenAllBoxesStatusDto openAllBoxesStatusDto2 = new OpenAllBoxesStatusDto("FINISHED", 1, "finished");
            FINISHED = openAllBoxesStatusDto2;
            OpenAllBoxesStatusDto[] openAllBoxesStatusDtoArr = {openAllBoxesStatusDto, openAllBoxesStatusDto2};
            $VALUES = openAllBoxesStatusDtoArr;
            $ENTRIES = new asp(openAllBoxesStatusDtoArr);
            CREATOR = new a();
        }

        private OpenAllBoxesStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OpenAllBoxesStatusDto valueOf(String str) {
            return (OpenAllBoxesStatusDto) Enum.valueOf(OpenAllBoxesStatusDto.class, str);
        }

        public static OpenAllBoxesStatusDto[] values() {
            return (OpenAllBoxesStatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunUserSeasonDataDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("finished")
        public static final StatusDto FINISHED;

        @pmi0("in_progress")
        public static final StatusDto IN_PROGRESS;

        @pmi0("not_started")
        public static final StatusDto NOT_STARTED;

        @pmi0("waiting_for_results")
        public static final StatusDto WAITING_FOR_RESULTS;
        private final String value;

        /* compiled from: VkRunUserSeasonDataDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("NOT_STARTED", 0, "not_started");
            NOT_STARTED = statusDto;
            StatusDto statusDto2 = new StatusDto("IN_PROGRESS", 1, "in_progress");
            IN_PROGRESS = statusDto2;
            StatusDto statusDto3 = new StatusDto("WAITING_FOR_RESULTS", 2, "waiting_for_results");
            WAITING_FOR_RESULTS = statusDto3;
            StatusDto statusDto4 = new StatusDto("FINISHED", 3, "finished");
            FINISHED = statusDto4;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VkRunUserSeasonDataDto.kt */
    public static final class a implements Parcelable.Creator<VkRunUserSeasonDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonDataDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int i;
            String str;
            ArrayList arrayList;
            String str2;
            ArrayList arrayList2;
            VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto;
            Integer num;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Integer num2;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            VkRunDatePeriodDto createFromParcel = VkRunDatePeriodDto.CREATOR.createFromParcel(parcel);
            VkRunUserSeasonProgressInfoDto createFromParcel2 = VkRunUserSeasonProgressInfoDto.CREATOR.createFromParcel(parcel);
            StatusDto createFromParcel3 = StatusDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            OpenAllBoxesStatusDto createFromParcel4 = OpenAllBoxesStatusDto.CREATOR.createFromParcel(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            String readString3 = parcel.readString();
            VkRunImageUrlsDto createFromParcel5 = parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel);
            VkRunImageUrlsDto createFromParcel6 = parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel);
            VkRunImageUrlsDto createFromParcel7 = parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel);
            VkRunImageUrlsDto createFromParcel8 = parcel.readInt() == 0 ? null : VkRunImageUrlsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                i = readInt;
                str = readString;
                str2 = readString2;
                arrayList = null;
            } else {
                i = readInt;
                int readInt3 = parcel.readInt();
                str = readString;
                arrayList = new ArrayList(readInt3);
                str2 = readString2;
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(VkRunUserSeasonLevelItemDto.CREATOR, parcel, arrayList, i2, 1);
                    readInt3 = readInt3;
                    createFromParcel = createFromParcel;
                }
            }
            VkRunDatePeriodDto vkRunDatePeriodDto = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = en.a(VkRunSeasonMilestoneItemDto.CREATOR, parcel, arrayList2, i3, 1);
                    readInt4 = readInt4;
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList8 = arrayList;
            VkRunSeasonBoxCountersDto createFromParcel9 = parcel.readInt() == 0 ? null : VkRunSeasonBoxCountersDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                vkRunSeasonBoxCountersDto = createFromParcel9;
                num = valueOf5;
                arrayList4 = arrayList2;
                arrayList3 = null;
            } else {
                vkRunSeasonBoxCountersDto = createFromParcel9;
                int readInt5 = parcel.readInt();
                num = valueOf5;
                arrayList3 = new ArrayList(readInt5);
                arrayList4 = arrayList2;
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(VkRunSeasonTaskDto.CREATOR, parcel, arrayList3, i4, 1);
                    readInt5 = readInt5;
                    valueOf6 = valueOf6;
                }
            }
            Integer num3 = valueOf6;
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                num2 = valueOf7;
                int i5 = 0;
                while (true) {
                    arrayList6 = arrayList3;
                    if (i5 == readInt6) {
                        break;
                    }
                    i5 = en.a(VkRunSeasonUserPrizeDto.CREATOR, parcel, arrayList5, i5, 1);
                    arrayList3 = arrayList6;
                    readInt6 = readInt6;
                }
            } else {
                num2 = valueOf7;
                arrayList5 = null;
                arrayList6 = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = en.a(VkRunSeasonPrizeDto.CREATOR, parcel, arrayList7, i6, 1);
                    readInt7 = readInt7;
                    arrayList5 = arrayList5;
                }
            }
            ArrayList arrayList9 = arrayList5;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkRunUserSeasonDataDto(i, str, str2, vkRunDatePeriodDto, createFromParcel2, createFromParcel3, readInt2, createFromParcel4, z2, z, readString3, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, bool, valueOf4, valueOf2, readString4, arrayList8, arrayList4, vkRunSeasonBoxCountersDto, num, num3, arrayList6, num2, arrayList9, arrayList7, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonDataDto[] newArray(int i) {
            return new VkRunUserSeasonDataDto[i];
        }
    }

    public VkRunUserSeasonDataDto(int i, String str, String str2, VkRunDatePeriodDto vkRunDatePeriodDto, VkRunUserSeasonProgressInfoDto vkRunUserSeasonProgressInfoDto, StatusDto statusDto, int i2, OpenAllBoxesStatusDto openAllBoxesStatusDto, boolean z, boolean z2, String str3, VkRunImageUrlsDto vkRunImageUrlsDto, VkRunImageUrlsDto vkRunImageUrlsDto2, VkRunImageUrlsDto vkRunImageUrlsDto3, VkRunImageUrlsDto vkRunImageUrlsDto4, Boolean bool, Integer num, Boolean bool2, String str4, List<VkRunUserSeasonLevelItemDto> list, List<VkRunSeasonMilestoneItemDto> list2, VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto, Integer num2, Integer num3, List<VkRunSeasonTaskDto> list3, Integer num4, List<VkRunSeasonUserPrizeDto> list4, List<VkRunSeasonPrizeDto> list5, Boolean bool3) {
        this.id = i;
        this.title = str;
        this.description = str2;
        this.period = vkRunDatePeriodDto;
        this.progress = vkRunUserSeasonProgressInfoDto;
        this.status = statusDto;
        this.waitingForResultPeriodLength = i2;
        this.openAllBoxesStatus = openAllBoxesStatusDto;
        this.vkpayAllowed = z;
        this.isWinner = z2;
        this.subtitle = str3;
        this.squareImage = vkRunImageUrlsDto;
        this.previewImage = vkRunImageUrlsDto2;
        this.coverImage = vkRunImageUrlsDto3;
        this.onboardingImage = vkRunImageUrlsDto4;
        this.hasGoldenPass = bool;
        this.boost = num;
        this.canBuyBoost = bool2;
        this.winnersListUrl = str4;
        this.levelItems = list;
        this.milestoneItems = list2;
        this.boxCounters = vkRunSeasonBoxCountersDto;
        this.collectedProductsTotal = num2;
        this.collectedTicketsTotal = num3;
        this.tasks = list3;
        this.openedBoxesCount = num4;
        this.userPrizes = list4;
        this.prizes = list5;
        this.hasUndreadInternalNotifications = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunUserSeasonDataDto)) {
            return false;
        }
        VkRunUserSeasonDataDto vkRunUserSeasonDataDto = (VkRunUserSeasonDataDto) obj;
        return this.id == vkRunUserSeasonDataDto.id && epx.f(this.title, vkRunUserSeasonDataDto.title) && epx.f(this.description, vkRunUserSeasonDataDto.description) && epx.f(this.period, vkRunUserSeasonDataDto.period) && epx.f(this.progress, vkRunUserSeasonDataDto.progress) && this.status == vkRunUserSeasonDataDto.status && this.waitingForResultPeriodLength == vkRunUserSeasonDataDto.waitingForResultPeriodLength && this.openAllBoxesStatus == vkRunUserSeasonDataDto.openAllBoxesStatus && this.vkpayAllowed == vkRunUserSeasonDataDto.vkpayAllowed && this.isWinner == vkRunUserSeasonDataDto.isWinner && epx.f(this.subtitle, vkRunUserSeasonDataDto.subtitle) && epx.f(this.squareImage, vkRunUserSeasonDataDto.squareImage) && epx.f(this.previewImage, vkRunUserSeasonDataDto.previewImage) && epx.f(this.coverImage, vkRunUserSeasonDataDto.coverImage) && epx.f(this.onboardingImage, vkRunUserSeasonDataDto.onboardingImage) && epx.f(this.hasGoldenPass, vkRunUserSeasonDataDto.hasGoldenPass) && epx.f(this.boost, vkRunUserSeasonDataDto.boost) && epx.f(this.canBuyBoost, vkRunUserSeasonDataDto.canBuyBoost) && epx.f(this.winnersListUrl, vkRunUserSeasonDataDto.winnersListUrl) && epx.f(this.levelItems, vkRunUserSeasonDataDto.levelItems) && epx.f(this.milestoneItems, vkRunUserSeasonDataDto.milestoneItems) && epx.f(this.boxCounters, vkRunUserSeasonDataDto.boxCounters) && epx.f(this.collectedProductsTotal, vkRunUserSeasonDataDto.collectedProductsTotal) && epx.f(this.collectedTicketsTotal, vkRunUserSeasonDataDto.collectedTicketsTotal) && epx.f(this.tasks, vkRunUserSeasonDataDto.tasks) && epx.f(this.openedBoxesCount, vkRunUserSeasonDataDto.openedBoxesCount) && epx.f(this.userPrizes, vkRunUserSeasonDataDto.userPrizes) && epx.f(this.prizes, vkRunUserSeasonDataDto.prizes) && epx.f(this.hasUndreadInternalNotifications, vkRunUserSeasonDataDto.hasUndreadInternalNotifications);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.openAllBoxesStatus.hashCode() + shy.a(this.waitingForResultPeriodLength, (this.status.hashCode() + ((this.progress.hashCode() + ((this.period.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.description)) * 31)) * 31)) * 31, 31)) * 31, 31, this.vkpayAllowed), 31, this.isWinner);
        String str = this.subtitle;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto = this.squareImage;
        int hashCode2 = (hashCode + (vkRunImageUrlsDto == null ? 0 : vkRunImageUrlsDto.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto2 = this.previewImage;
        int hashCode3 = (hashCode2 + (vkRunImageUrlsDto2 == null ? 0 : vkRunImageUrlsDto2.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto3 = this.coverImage;
        int hashCode4 = (hashCode3 + (vkRunImageUrlsDto3 == null ? 0 : vkRunImageUrlsDto3.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto4 = this.onboardingImage;
        int hashCode5 = (hashCode4 + (vkRunImageUrlsDto4 == null ? 0 : vkRunImageUrlsDto4.hashCode())) * 31;
        Boolean bool = this.hasGoldenPass;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.boost;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.canBuyBoost;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.winnersListUrl;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<VkRunUserSeasonLevelItemDto> list = this.levelItems;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<VkRunSeasonMilestoneItemDto> list2 = this.milestoneItems;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto = this.boxCounters;
        int hashCode12 = (hashCode11 + (vkRunSeasonBoxCountersDto == null ? 0 : vkRunSeasonBoxCountersDto.hashCode())) * 31;
        Integer num2 = this.collectedProductsTotal;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.collectedTicketsTotal;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<VkRunSeasonTaskDto> list3 = this.tasks;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num4 = this.openedBoxesCount;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<VkRunSeasonUserPrizeDto> list4 = this.userPrizes;
        int hashCode17 = (hashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<VkRunSeasonPrizeDto> list5 = this.prizes;
        int hashCode18 = (hashCode17 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool3 = this.hasUndreadInternalNotifications;
        return hashCode18 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunUserSeasonDataDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", waitingForResultPeriodLength=");
        sb.append(this.waitingForResultPeriodLength);
        sb.append(", openAllBoxesStatus=");
        sb.append(this.openAllBoxesStatus);
        sb.append(", vkpayAllowed=");
        sb.append(this.vkpayAllowed);
        sb.append(", isWinner=");
        sb.append(this.isWinner);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", squareImage=");
        sb.append(this.squareImage);
        sb.append(", previewImage=");
        sb.append(this.previewImage);
        sb.append(", coverImage=");
        sb.append(this.coverImage);
        sb.append(", onboardingImage=");
        sb.append(this.onboardingImage);
        sb.append(", hasGoldenPass=");
        sb.append(this.hasGoldenPass);
        sb.append(", boost=");
        sb.append(this.boost);
        sb.append(", canBuyBoost=");
        sb.append(this.canBuyBoost);
        sb.append(", winnersListUrl=");
        sb.append(this.winnersListUrl);
        sb.append(", levelItems=");
        sb.append(this.levelItems);
        sb.append(", milestoneItems=");
        sb.append(this.milestoneItems);
        sb.append(", boxCounters=");
        sb.append(this.boxCounters);
        sb.append(", collectedProductsTotal=");
        sb.append(this.collectedProductsTotal);
        sb.append(", collectedTicketsTotal=");
        sb.append(this.collectedTicketsTotal);
        sb.append(", tasks=");
        sb.append(this.tasks);
        sb.append(", openedBoxesCount=");
        sb.append(this.openedBoxesCount);
        sb.append(", userPrizes=");
        sb.append(this.userPrizes);
        sb.append(", prizes=");
        sb.append(this.prizes);
        sb.append(", hasUndreadInternalNotifications=");
        return tn.a(sb, this.hasUndreadInternalNotifications, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.period.writeToParcel(parcel, i);
        this.progress.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.waitingForResultPeriodLength);
        this.openAllBoxesStatus.writeToParcel(parcel, i);
        parcel.writeInt(this.vkpayAllowed ? 1 : 0);
        parcel.writeInt(this.isWinner ? 1 : 0);
        parcel.writeString(this.subtitle);
        VkRunImageUrlsDto vkRunImageUrlsDto = this.squareImage;
        if (vkRunImageUrlsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto.writeToParcel(parcel, i);
        }
        VkRunImageUrlsDto vkRunImageUrlsDto2 = this.previewImage;
        if (vkRunImageUrlsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto2.writeToParcel(parcel, i);
        }
        VkRunImageUrlsDto vkRunImageUrlsDto3 = this.coverImage;
        if (vkRunImageUrlsDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto3.writeToParcel(parcel, i);
        }
        VkRunImageUrlsDto vkRunImageUrlsDto4 = this.onboardingImage;
        if (vkRunImageUrlsDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto4.writeToParcel(parcel, i);
        }
        Boolean bool = this.hasGoldenPass;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.boost;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool2 = this.canBuyBoost;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.winnersListUrl);
        List<VkRunUserSeasonLevelItemDto> list = this.levelItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VkRunUserSeasonLevelItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VkRunSeasonMilestoneItemDto> list2 = this.milestoneItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((VkRunSeasonMilestoneItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto = this.boxCounters;
        if (vkRunSeasonBoxCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunSeasonBoxCountersDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.collectedProductsTotal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.collectedTicketsTotal;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        List<VkRunSeasonTaskDto> list3 = this.tasks;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((VkRunSeasonTaskDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num4 = this.openedBoxesCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<VkRunSeasonUserPrizeDto> list4 = this.userPrizes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((VkRunSeasonUserPrizeDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<VkRunSeasonPrizeDto> list5 = this.prizes;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((VkRunSeasonPrizeDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool3 = this.hasUndreadInternalNotifications;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ VkRunUserSeasonDataDto(int i, String str, String str2, VkRunDatePeriodDto vkRunDatePeriodDto, VkRunUserSeasonProgressInfoDto vkRunUserSeasonProgressInfoDto, StatusDto statusDto, int i2, OpenAllBoxesStatusDto openAllBoxesStatusDto, boolean z, boolean z2, String str3, VkRunImageUrlsDto vkRunImageUrlsDto, VkRunImageUrlsDto vkRunImageUrlsDto2, VkRunImageUrlsDto vkRunImageUrlsDto3, VkRunImageUrlsDto vkRunImageUrlsDto4, Boolean bool, Integer num, Boolean bool2, String str4, List list, List list2, VkRunSeasonBoxCountersDto vkRunSeasonBoxCountersDto, Integer num2, Integer num3, List list3, Integer num4, List list4, List list5, Boolean bool3, int i3, zcl zclVar) {
        this(i, str, str2, vkRunDatePeriodDto, vkRunUserSeasonProgressInfoDto, statusDto, i2, openAllBoxesStatusDto, z, z2, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : vkRunImageUrlsDto, (i3 & 4096) != 0 ? null : vkRunImageUrlsDto2, (i3 & 8192) != 0 ? null : vkRunImageUrlsDto3, (i3 & 16384) != 0 ? null : vkRunImageUrlsDto4, (32768 & i3) != 0 ? null : bool, (65536 & i3) != 0 ? null : num, (131072 & i3) != 0 ? null : bool2, (262144 & i3) != 0 ? null : str4, (524288 & i3) != 0 ? null : list, (1048576 & i3) != 0 ? null : list2, (2097152 & i3) != 0 ? null : vkRunSeasonBoxCountersDto, (4194304 & i3) != 0 ? null : num2, (8388608 & i3) != 0 ? null : num3, (16777216 & i3) != 0 ? null : list3, (33554432 & i3) != 0 ? null : num4, (67108864 & i3) != 0 ? null : list4, (134217728 & i3) != 0 ? null : list5, (i3 & 268435456) != 0 ? null : bool3);
    }
}
