package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksSaveObjectTypeDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksSaveObjectTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksSaveObjectTypeDto[] $VALUES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final ActionLinksSaveObjectTypeDto APP;

    @pmi0("article")
    public static final ActionLinksSaveObjectTypeDto ARTICLE;
    public static final Parcelable.Creator<ActionLinksSaveObjectTypeDto> CREATOR;

    @pmi0("group")
    public static final ActionLinksSaveObjectTypeDto GROUP;

    @pmi0("moneysend")
    public static final ActionLinksSaveObjectTypeDto MONEYSEND;

    @pmi0("page")
    public static final ActionLinksSaveObjectTypeDto PAGE;

    @pmi0("poll")
    public static final ActionLinksSaveObjectTypeDto POLL;

    @pmi0("post")
    public static final ActionLinksSaveObjectTypeDto POST;

    @pmi0("product")
    public static final ActionLinksSaveObjectTypeDto PRODUCT;

    @pmi0("user")
    public static final ActionLinksSaveObjectTypeDto USER;
    private final String value;

    /* compiled from: ActionLinksSaveObjectTypeDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksSaveObjectTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveObjectTypeDto createFromParcel(Parcel parcel) {
            return ActionLinksSaveObjectTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveObjectTypeDto[] newArray(int i) {
            return new ActionLinksSaveObjectTypeDto[i];
        }
    }

    static {
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto = new ActionLinksSaveObjectTypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = actionLinksSaveObjectTypeDto;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto2 = new ActionLinksSaveObjectTypeDto("ARTICLE", 1, "article");
        ARTICLE = actionLinksSaveObjectTypeDto2;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto3 = new ActionLinksSaveObjectTypeDto("GROUP", 2, "group");
        GROUP = actionLinksSaveObjectTypeDto3;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto4 = new ActionLinksSaveObjectTypeDto("MONEYSEND", 3, "moneysend");
        MONEYSEND = actionLinksSaveObjectTypeDto4;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto5 = new ActionLinksSaveObjectTypeDto("PAGE", 4, "page");
        PAGE = actionLinksSaveObjectTypeDto5;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto6 = new ActionLinksSaveObjectTypeDto("POLL", 5, "poll");
        POLL = actionLinksSaveObjectTypeDto6;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto7 = new ActionLinksSaveObjectTypeDto("POST", 6, "post");
        POST = actionLinksSaveObjectTypeDto7;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto8 = new ActionLinksSaveObjectTypeDto("PRODUCT", 7, "product");
        PRODUCT = actionLinksSaveObjectTypeDto8;
        ActionLinksSaveObjectTypeDto actionLinksSaveObjectTypeDto9 = new ActionLinksSaveObjectTypeDto("USER", 8, "user");
        USER = actionLinksSaveObjectTypeDto9;
        ActionLinksSaveObjectTypeDto[] actionLinksSaveObjectTypeDtoArr = {actionLinksSaveObjectTypeDto, actionLinksSaveObjectTypeDto2, actionLinksSaveObjectTypeDto3, actionLinksSaveObjectTypeDto4, actionLinksSaveObjectTypeDto5, actionLinksSaveObjectTypeDto6, actionLinksSaveObjectTypeDto7, actionLinksSaveObjectTypeDto8, actionLinksSaveObjectTypeDto9};
        $VALUES = actionLinksSaveObjectTypeDtoArr;
        $ENTRIES = new asp(actionLinksSaveObjectTypeDtoArr);
        CREATOR = new a();
    }

    private ActionLinksSaveObjectTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksSaveObjectTypeDto valueOf(String str) {
        return (ActionLinksSaveObjectTypeDto) Enum.valueOf(ActionLinksSaveObjectTypeDto.class, str);
    }

    public static ActionLinksSaveObjectTypeDto[] values() {
        return (ActionLinksSaveObjectTypeDto[]) $VALUES.clone();
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
