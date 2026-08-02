package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAddSnippetButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsAddSnippetButtonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAddSnippetButtonDto[] $VALUES;

    @pmi0("buy")
    public static final AppsAddSnippetButtonDto BUY;

    @pmi0("buy_ticket")
    public static final AppsAddSnippetButtonDto BUY_TICKET;

    @pmi0("contact")
    public static final AppsAddSnippetButtonDto CONTACT;

    @pmi0("create")
    public static final AppsAddSnippetButtonDto CREATE;
    public static final Parcelable.Creator<AppsAddSnippetButtonDto> CREATOR;

    @pmi0("enroll")
    public static final AppsAddSnippetButtonDto ENROLL;

    @pmi0("fill")
    public static final AppsAddSnippetButtonDto FILL;

    @pmi0("go")
    public static final AppsAddSnippetButtonDto GO;

    @pmi0("help")
    public static final AppsAddSnippetButtonDto HELP;

    @pmi0("open")
    public static final AppsAddSnippetButtonDto OPEN;

    @pmi0("play")
    public static final AppsAddSnippetButtonDto PLAY;
    private final String value;

    /* compiled from: AppsAddSnippetButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsAddSnippetButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetButtonDto createFromParcel(Parcel parcel) {
            return AppsAddSnippetButtonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetButtonDto[] newArray(int i) {
            return new AppsAddSnippetButtonDto[i];
        }
    }

    static {
        AppsAddSnippetButtonDto appsAddSnippetButtonDto = new AppsAddSnippetButtonDto("BUY", 0, "buy");
        BUY = appsAddSnippetButtonDto;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto2 = new AppsAddSnippetButtonDto("BUY_TICKET", 1, "buy_ticket");
        BUY_TICKET = appsAddSnippetButtonDto2;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto3 = new AppsAddSnippetButtonDto("CONTACT", 2, "contact");
        CONTACT = appsAddSnippetButtonDto3;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto4 = new AppsAddSnippetButtonDto("CREATE", 3, "create");
        CREATE = appsAddSnippetButtonDto4;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto5 = new AppsAddSnippetButtonDto("ENROLL", 4, "enroll");
        ENROLL = appsAddSnippetButtonDto5;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto6 = new AppsAddSnippetButtonDto("FILL", 5, "fill");
        FILL = appsAddSnippetButtonDto6;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto7 = new AppsAddSnippetButtonDto("GO", 6, "go");
        GO = appsAddSnippetButtonDto7;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto8 = new AppsAddSnippetButtonDto("HELP", 7, "help");
        HELP = appsAddSnippetButtonDto8;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto9 = new AppsAddSnippetButtonDto("OPEN", 8, "open");
        OPEN = appsAddSnippetButtonDto9;
        AppsAddSnippetButtonDto appsAddSnippetButtonDto10 = new AppsAddSnippetButtonDto("PLAY", 9, "play");
        PLAY = appsAddSnippetButtonDto10;
        AppsAddSnippetButtonDto[] appsAddSnippetButtonDtoArr = {appsAddSnippetButtonDto, appsAddSnippetButtonDto2, appsAddSnippetButtonDto3, appsAddSnippetButtonDto4, appsAddSnippetButtonDto5, appsAddSnippetButtonDto6, appsAddSnippetButtonDto7, appsAddSnippetButtonDto8, appsAddSnippetButtonDto9, appsAddSnippetButtonDto10};
        $VALUES = appsAddSnippetButtonDtoArr;
        $ENTRIES = new asp(appsAddSnippetButtonDtoArr);
        CREATOR = new a();
    }

    private AppsAddSnippetButtonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAddSnippetButtonDto valueOf(String str) {
        return (AppsAddSnippetButtonDto) Enum.valueOf(AppsAddSnippetButtonDto.class, str);
    }

    public static AppsAddSnippetButtonDto[] values() {
        return (AppsAddSnippetButtonDto[]) $VALUES.clone();
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
