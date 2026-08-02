package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsMiniappsAchievementInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsAchievementInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsAchievementInfoDto> CREATOR = new a();

    @pmi0("achievement_type")
    private final AchievementTypeDto achievementType;

    @pmi0("button")
    private final AppsAchievementBlockButtonDto button;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("label")
    private final AppsAchievementBlockLabelDto label;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final Integer progress;

    @pmi0("state")
    private final StateDto state;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("what_inside_modal_info")
    private final AppsAchievementBlockWhatInsideModalInfoDto whatInsideModalInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsMiniappsAchievementInfoDto.kt */
    public static final class AchievementTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AchievementTypeDto[] $VALUES;
        public static final Parcelable.Creator<AchievementTypeDto> CREATOR;

        @pmi0("timespent")
        public static final AchievementTypeDto TIMESPENT;

        @pmi0("votes")
        public static final AchievementTypeDto VOTES;
        private final String value;

        /* compiled from: AppsMiniappsAchievementInfoDto.kt */
        public static final class a implements Parcelable.Creator<AchievementTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final AchievementTypeDto createFromParcel(Parcel parcel) {
                return AchievementTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AchievementTypeDto[] newArray(int i) {
                return new AchievementTypeDto[i];
            }
        }

        static {
            AchievementTypeDto achievementTypeDto = new AchievementTypeDto("TIMESPENT", 0, "timespent");
            TIMESPENT = achievementTypeDto;
            AchievementTypeDto achievementTypeDto2 = new AchievementTypeDto("VOTES", 1, "votes");
            VOTES = achievementTypeDto2;
            AchievementTypeDto[] achievementTypeDtoArr = {achievementTypeDto, achievementTypeDto2};
            $VALUES = achievementTypeDtoArr;
            $ENTRIES = new asp(achievementTypeDtoArr);
            CREATOR = new a();
        }

        private AchievementTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AchievementTypeDto valueOf(String str) {
            return (AchievementTypeDto) Enum.valueOf(AchievementTypeDto.class, str);
        }

        public static AchievementTypeDto[] values() {
            return (AchievementTypeDto[]) $VALUES.clone();
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
    /* compiled from: AppsMiniappsAchievementInfoDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("in_progress")
        public static final StateDto IN_PROGRESS;

        @pmi0("open")
        public static final StateDto OPEN;

        @pmi0("ready_to_open")
        public static final StateDto READY_TO_OPEN;
        private final String value;

        /* compiled from: AppsMiniappsAchievementInfoDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("IN_PROGRESS", 0, "in_progress");
            IN_PROGRESS = stateDto;
            StateDto stateDto2 = new StateDto("READY_TO_OPEN", 1, "ready_to_open");
            READY_TO_OPEN = stateDto2;
            StateDto stateDto3 = new StateDto("OPEN", 2, "open");
            OPEN = stateDto3;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
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

    /* compiled from: AppsMiniappsAchievementInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsAchievementInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAchievementInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            AchievementTypeDto createFromParcel = AchievementTypeDto.CREATOR.createFromParcel(parcel);
            StateDto createFromParcel2 = StateDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            AppsAchievementBlockLabelDto createFromParcel3 = parcel.readInt() == 0 ? null : AppsAchievementBlockLabelDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsMiniappsAchievementInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsMiniappsAchievementInfoDto(readString, createFromParcel, createFromParcel2, readString2, createFromParcel3, valueOf, arrayList, parcel.readInt() == 0 ? null : AppsAchievementBlockButtonDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAchievementBlockWhatInsideModalInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAchievementInfoDto[] newArray(int i) {
            return new AppsMiniappsAchievementInfoDto[i];
        }
    }

    public AppsMiniappsAchievementInfoDto(String str, AchievementTypeDto achievementTypeDto, StateDto stateDto, String str2, AppsAchievementBlockLabelDto appsAchievementBlockLabelDto, Integer num, List<BaseImageDto> list, AppsAchievementBlockButtonDto appsAchievementBlockButtonDto, AppsAchievementBlockWhatInsideModalInfoDto appsAchievementBlockWhatInsideModalInfoDto) {
        this.title = str;
        this.achievementType = achievementTypeDto;
        this.state = stateDto;
        this.subtitle = str2;
        this.label = appsAchievementBlockLabelDto;
        this.progress = num;
        this.image = list;
        this.button = appsAchievementBlockButtonDto;
        this.whatInsideModalInfo = appsAchievementBlockWhatInsideModalInfoDto;
    }

    public final AchievementTypeDto d() {
        return this.achievementType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsAchievementBlockButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsAchievementInfoDto)) {
            return false;
        }
        AppsMiniappsAchievementInfoDto appsMiniappsAchievementInfoDto = (AppsMiniappsAchievementInfoDto) obj;
        return epx.f(this.title, appsMiniappsAchievementInfoDto.title) && this.achievementType == appsMiniappsAchievementInfoDto.achievementType && this.state == appsMiniappsAchievementInfoDto.state && epx.f(this.subtitle, appsMiniappsAchievementInfoDto.subtitle) && epx.f(this.label, appsMiniappsAchievementInfoDto.label) && epx.f(this.progress, appsMiniappsAchievementInfoDto.progress) && epx.f(this.image, appsMiniappsAchievementInfoDto.image) && epx.f(this.button, appsMiniappsAchievementInfoDto.button) && epx.f(this.whatInsideModalInfo, appsMiniappsAchievementInfoDto.whatInsideModalInfo);
    }

    public final List<BaseImageDto> f() {
        return this.image;
    }

    public final AppsAchievementBlockLabelDto g() {
        return this.label;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.state.hashCode() + ((this.achievementType.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AppsAchievementBlockLabelDto appsAchievementBlockLabelDto = this.label;
        int hashCode3 = (hashCode2 + (appsAchievementBlockLabelDto == null ? 0 : appsAchievementBlockLabelDto.hashCode())) * 31;
        Integer num = this.progress;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        AppsAchievementBlockButtonDto appsAchievementBlockButtonDto = this.button;
        int hashCode6 = (hashCode5 + (appsAchievementBlockButtonDto == null ? 0 : appsAchievementBlockButtonDto.hashCode())) * 31;
        AppsAchievementBlockWhatInsideModalInfoDto appsAchievementBlockWhatInsideModalInfoDto = this.whatInsideModalInfo;
        return hashCode6 + (appsAchievementBlockWhatInsideModalInfoDto != null ? appsAchievementBlockWhatInsideModalInfoDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.progress;
    }

    public final StateDto j() {
        return this.state;
    }

    public final String k() {
        return this.subtitle;
    }

    public final AppsAchievementBlockWhatInsideModalInfoDto l() {
        return this.whatInsideModalInfo;
    }

    public final String toString() {
        return "AppsMiniappsAchievementInfoDto(title=" + this.title + ", achievementType=" + this.achievementType + ", state=" + this.state + ", subtitle=" + this.subtitle + ", label=" + this.label + ", progress=" + this.progress + ", image=" + this.image + ", button=" + this.button + ", whatInsideModalInfo=" + this.whatInsideModalInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.achievementType.writeToParcel(parcel, i);
        this.state.writeToParcel(parcel, i);
        parcel.writeString(this.subtitle);
        AppsAchievementBlockLabelDto appsAchievementBlockLabelDto = this.label;
        if (appsAchievementBlockLabelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAchievementBlockLabelDto.writeToParcel(parcel, i);
        }
        Integer num = this.progress;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        AppsAchievementBlockButtonDto appsAchievementBlockButtonDto = this.button;
        if (appsAchievementBlockButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAchievementBlockButtonDto.writeToParcel(parcel, i);
        }
        AppsAchievementBlockWhatInsideModalInfoDto appsAchievementBlockWhatInsideModalInfoDto = this.whatInsideModalInfo;
        if (appsAchievementBlockWhatInsideModalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAchievementBlockWhatInsideModalInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsMiniappsAchievementInfoDto(String str, AchievementTypeDto achievementTypeDto, StateDto stateDto, String str2, AppsAchievementBlockLabelDto appsAchievementBlockLabelDto, Integer num, List list, AppsAchievementBlockButtonDto appsAchievementBlockButtonDto, AppsAchievementBlockWhatInsideModalInfoDto appsAchievementBlockWhatInsideModalInfoDto, int i, zcl zclVar) {
        this(str, achievementTypeDto, stateDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : appsAchievementBlockLabelDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : appsAchievementBlockButtonDto, (i & 256) != 0 ? null : appsAchievementBlockWhatInsideModalInfoDto);
    }
}
