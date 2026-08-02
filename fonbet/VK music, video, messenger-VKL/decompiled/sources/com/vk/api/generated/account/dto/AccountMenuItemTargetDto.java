package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountMenuItemTargetDto.kt */
/* loaded from: classes14.dex */
public final class AccountMenuItemTargetDto implements Parcelable {
    public static final Parcelable.Creator<AccountMenuItemTargetDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountMenuItemTargetDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("open_app")
        public static final ActionDto OPEN_APP;
        private final String value;

        /* compiled from: AccountMenuItemTargetDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("OPEN_APP", 0, "open_app");
            OPEN_APP = actionDto;
            ActionDto[] actionDtoArr = {actionDto};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
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

    /* compiled from: AccountMenuItemTargetDto.kt */
    public static final class a implements Parcelable.Creator<AccountMenuItemTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMenuItemTargetDto createFromParcel(Parcel parcel) {
            return new AccountMenuItemTargetDto(ActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMenuItemTargetDto[] newArray(int i) {
            return new AccountMenuItemTargetDto[i];
        }
    }

    public AccountMenuItemTargetDto(ActionDto actionDto, Integer num, String str) {
        this.action = actionDto;
        this.appId = num;
        this.webviewUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMenuItemTargetDto)) {
            return false;
        }
        AccountMenuItemTargetDto accountMenuItemTargetDto = (AccountMenuItemTargetDto) obj;
        return this.action == accountMenuItemTargetDto.action && epx.f(this.appId, accountMenuItemTargetDto.appId) && epx.f(this.webviewUrl, accountMenuItemTargetDto.webviewUrl);
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        Integer num = this.appId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.webviewUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMenuItemTargetDto(action=");
        sb.append(this.action);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.webviewUrl);
    }

    public /* synthetic */ AccountMenuItemTargetDto(ActionDto actionDto, Integer num, String str, int i, zcl zclVar) {
        this(actionDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
