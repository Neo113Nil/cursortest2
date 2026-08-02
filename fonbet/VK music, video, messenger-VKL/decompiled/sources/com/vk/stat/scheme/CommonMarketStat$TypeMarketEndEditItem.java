package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketEndEditItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("attached_photo_count")
    private final Integer attachedPhotoCount;

    @pmi0("changed_parameters")
    private final CommonMarketStat$MarketEndEditItemChangedParameters changedParameters;

    @pmi0("status")
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @pmi0("cancel_create_item")
        public static final Status CANCEL_CREATE_ITEM;

        @pmi0("cancel_edit_item")
        public static final Status CANCEL_EDIT_ITEM;

        @pmi0("fail_save_item")
        public static final Status FAIL_SAVE_ITEM;

        @pmi0("save_created_item")
        public static final Status SAVE_CREATED_ITEM;

        @pmi0("save_edited_item")
        public static final Status SAVE_EDITED_ITEM;

        static {
            Status status = new Status("CANCEL_EDIT_ITEM", 0);
            CANCEL_EDIT_ITEM = status;
            Status status2 = new Status("CANCEL_CREATE_ITEM", 1);
            CANCEL_CREATE_ITEM = status2;
            Status status3 = new Status("SAVE_EDITED_ITEM", 2);
            SAVE_EDITED_ITEM = status3;
            Status status4 = new Status("SAVE_CREATED_ITEM", 3);
            SAVE_CREATED_ITEM = status4;
            Status status5 = new Status("FAIL_SAVE_ITEM", 4);
            FAIL_SAVE_ITEM = status5;
            Status[] statusArr = {status, status2, status3, status4, status5};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public CommonMarketStat$TypeMarketEndEditItem(Status status, CommonMarketStat$MarketEndEditItemChangedParameters commonMarketStat$MarketEndEditItemChangedParameters, Integer num) {
        this.status = status;
        this.changedParameters = commonMarketStat$MarketEndEditItemChangedParameters;
        this.attachedPhotoCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketEndEditItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketEndEditItem commonMarketStat$TypeMarketEndEditItem = (CommonMarketStat$TypeMarketEndEditItem) obj;
        return this.status == commonMarketStat$TypeMarketEndEditItem.status && epx.f(this.changedParameters, commonMarketStat$TypeMarketEndEditItem.changedParameters) && epx.f(this.attachedPhotoCount, commonMarketStat$TypeMarketEndEditItem.attachedPhotoCount);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        CommonMarketStat$MarketEndEditItemChangedParameters commonMarketStat$MarketEndEditItemChangedParameters = this.changedParameters;
        int hashCode2 = (hashCode + (commonMarketStat$MarketEndEditItemChangedParameters == null ? 0 : commonMarketStat$MarketEndEditItemChangedParameters.hashCode())) * 31;
        Integer num = this.attachedPhotoCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketEndEditItem(status=");
        sb.append(this.status);
        sb.append(", changedParameters=");
        sb.append(this.changedParameters);
        sb.append(", attachedPhotoCount=");
        return uqi.b(sb, this.attachedPhotoCount, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeMarketEndEditItem(Status status, CommonMarketStat$MarketEndEditItemChangedParameters commonMarketStat$MarketEndEditItemChangedParameters, Integer num, int i, zcl zclVar) {
        this(status, (i & 2) != 0 ? null : commonMarketStat$MarketEndEditItemChangedParameters, (i & 4) != 0 ? null : num);
    }
}
